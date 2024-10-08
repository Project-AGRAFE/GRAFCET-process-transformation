package de.hsu.grafcet.process;

import de.hsu.grafcet.*;
import terms.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;



public class ProcessTransformation {

	boolean transformationExecuted = false;
	
	Grafcet g;
	Grafcet gTransformed;
	PartialGrafcet gProcess;
	PartialGrafcet gControl;
	PartialGrafcet gProcessNew;
	PartialGrafcet gControlNew;
	
	
	GrafcetFactory facG;
	TermsFactory facT;
	
	Step sProcess;	//Steps that syncronize process and control. If sProcess ist active gProcess can evaluate and vice versa
	Step sControl;
	
	int id = 0;
	
	
	
	public ProcessTransformation(Grafcet g) {
		this.g = g;
		initializeTransformation();
	}
	
	private void initializeTransformation() {
		gProcess = g.getProcessGrafcet();
		if (gProcess == null) {
			for (Grafcet partialGrafcet : g.getPartialGrafcets()) {
				if (partialGrafcet instanceof ProcessGrafcet) {
					gProcess = (PartialGrafcet)partialGrafcet;
				}
			}
		}
		gControl = g.getControlGrafcet();
		if (gControl == null) {
			for (Grafcet partialGrafcet : g.getPartialGrafcets()) {
				if (partialGrafcet instanceof ControlGrafcet) {
					gControl = (ControlGrafcet)partialGrafcet;
				}
			}
		}
		facG = GrafcetFactory.eINSTANCE;
		facT = TermsFactory.eINSTANCE;
		gTransformed = facG.createGrafcet();
	}
	
	private void runTransformation() {
		//transformVariables();
		gTransformed.setVariableDeclarationContainer(g.getVariableDeclarationContainer());
		gProcessNew = transformGrafcetVariants(gProcess);
		gProcess.setName("gProcess");
		gControlNew = transformGrafcetVariants(gControl);	
		transformActions(gProcessNew);
		transformActions(gControlNew);
		transformSynchronization();
		transformInitilializationProcess();
		transformTransitionConditionsProcessAndControl();
	
	}
	
	public Grafcet getTransformedGrafcet() {
		runTransformation();
		return gTransformed;
	}
	
	/**
	 * @deprecated do not use. Instead declare variables correctly in the process model
	 */
	private void transformVariables() {		
		for (VariableDeclaration varDecl : gTransformed.getVariableDeclarationContainer().getVariableDeclarations()) {
			varDecl.setVariableDeclarationType(VariableDeclarationType.INTERNAL);
		}
	}
	
	private void transformActions(PartialGrafcet grafcet) {
		Map<VariableDeclaration, Set<Or>> varsMapActivatingTerms = new HashMap<VariableDeclaration, Set<Or>>();
		Map<VariableDeclaration, Set<Or>> varsMapActivatingTermsCopy = new HashMap<VariableDeclaration, Set<Or>>();	//Later a deep copy of the terms is needed which is created on the fly
		for (ActionType actionType : grafcet.getActionTypes()) {
			if (actionType instanceof ContinuousAction) {
				ContinuousAction contAction = (ContinuousAction) actionType;
				VariableDeclaration varDecl = contAction.getVariable().getVariableDeclaration();
				for (ActionLink actionLink : grafcet.getActionLinks()) {
					if (actionLink.getActionType() == null) {
						throw new IllegalArgumentException("Action Link " + actionLink + " has no action connected to it. Pleace check .grafcet model.");
					}
					if (actionLink.getStep() == null) {
						throw new IllegalArgumentException("Action Link " + actionLink + " has no step connected to it. Pleace check .grafcet model.");
					}
					if (actionLink.getActionType().equals(contAction)) {
						if(varsMapActivatingTerms.get(varDecl) == null) {
							Set<Or> termsActivatingVar = new LinkedHashSet<Or>();
							Set<Or> termsActivatingVarCopy = new LinkedHashSet<Or>();
							varsMapActivatingTerms.put(varDecl, termsActivatingVar);
							varsMapActivatingTermsCopy.put(varDecl, termsActivatingVarCopy);
						}
						Or orCondT1 = generateOrTermFAction(actionLink.getStep(), contAction.getTerm(), 
								gTransformed.getVariableDeclarationContainer());
						Or orCondT1Copy = generateOrTermFAction(actionLink.getStep(), contAction.getTerm(), 
								gTransformed.getVariableDeclarationContainer());
						varsMapActivatingTerms.get(varDecl).add(orCondT1);
						varsMapActivatingTermsCopy.get(varDecl).add(orCondT1Copy);
					}
				}
			}
		}
		for (VariableDeclaration varDecl : varsMapActivatingTerms.keySet()) {
			PartialGrafcet gV = facG.createPartialGrafcet();
			gV.setName("G_contAction_" + varDecl.getName());
			Step s1 = generateStepAction(gV, true, varDecl);
			Step s2 = generateStepAction(gV, false, varDecl);

			Or termT1 = assembleTermConditionFAction(varsMapActivatingTerms.get(varDecl));
			Transition t1 = createTransitionFromTerm(getId(), gV, termT1);
			
			Not termT2 = facT.createNot();
			termT2.getSubterm().add(assembleTermConditionFAction(varsMapActivatingTermsCopy.get(varDecl)));
			Transition t2 = createTransitionFromTerm(getId(), gV, termT2);
			
			generateArc(s1, t1, grafcet);
			generateArc(t1, s2, grafcet);
			generateArc(s2, t2, grafcet);
			generateArc(t2, s1, grafcet);
		
			gTransformed.getPartialGrafcets().add(gV);
		}
	}
	
	
	/**
	 * Assembles the terms to (x_step_1 AND b_cond_1) OR (x_step_2 AND b_cond_2) OR ... OR false 
	 * Called by transformActions
	 * @param terms of structure (x_step AND b_cond) OR false 
	 * @return assembled OR Term
	 */
	private Or assembleTermConditionFAction(Set<Or> terms) {
		Or tOrOut = null;
		Or latestOrTerm = null;
		for(Or termActivatingVar: terms) {
			if(tOrOut == null) {
				tOrOut = termActivatingVar;
				latestOrTerm = termActivatingVar;
			} else {
				BooleanConstant tFalseToRemoved = null;
				for ( Term subterm : latestOrTerm.getSubterm()) {
					if (subterm instanceof BooleanConstant) {
						tFalseToRemoved = (BooleanConstant) subterm;
						latestOrTerm.getSubterm().add(termActivatingVar);
					}
				}
				latestOrTerm.getSubterm().remove(tFalseToRemoved);
				latestOrTerm = termActivatingVar;
			}
		}
		return tOrOut;
	}
	
	/**
	 * Generates expression (x_step AND cond) OR false. This is used as (part of) 
	 * transition condition for transformations of cont. actions
	 * Called by transformActions
	 * @param step step is transformed to step variable x_step; variable is added to variable declaration container  
	 * @param cond condition of cont. action
	 * @param container where the variable declaration is added to 
	 * @return expression of type OR
	 */
	private Or generateOrTermFAction(Step step, Term cond, VariableDeclarationContainer container) {
		Or orOut = facT.createOr();
		BooleanConstant tFalse = facT.createBooleanConstant();
		tFalse.setValue(false);
		orOut.getSubterm().add(tFalse);
		And tAnd = facT.createAnd();
		Variable stepVar = facT.createVariable();
		VariableDeclaration stepVarDecl = null;
		boolean foundVar = false;
		for (VariableDeclaration varDecl :  container.getVariableDeclarations()) {
			if (varDecl.getName().equals("X" + step.getId())) {
				foundVar = true;
				stepVarDecl = varDecl;
			}
		}
		if (!foundVar) {
			stepVarDecl= facT.createVariableDeclaration();
			stepVarDecl.setName("X" + step.getId());
			stepVarDecl.setStep(step);
			stepVarDecl.setVariableDeclarationType(VariableDeclarationType.INTERNAL);
			container.getVariableDeclarations().add(stepVarDecl);
		}
		stepVar.setVariableDeclaration(stepVarDecl);
		tAnd.getSubterm().add(stepVar);
		if (cond != null) {
			tAnd.getSubterm().add(cond);
		} else {
			BooleanConstant tTrue = facT.createBooleanConstant();
			tTrue.setValue(true);
			tAnd.getSubterm().add(tTrue);
		}
		orOut.getSubterm().add(tAnd);		
		return orOut;
	}
	
	
	private void generateArc(Node source, Node target, Grafcet grafcet) {
		Arc a = facG.createArc();
		a.setSource(source);
		a.setTarget(target);
		grafcet.getArcs().add(a);
	}
	
	/**
	 * Generates a Step and an associated Stored Action.
	 * Called by transformActions
	 * @param grafcet the construct is added to
	 * @param initial flag: true if its the intial step and the action sets variable to false, false the opposite
	 * @param varDecl variable that is manipulated
	 */
	private Step generateStepAction(Grafcet grafcet, boolean initial, VariableDeclaration varDecl) {
		Step step = facG.createStep(getId());
		step.setId(getId());
		step.setInitial(initial);
		
		StoredAction actionV = facG.createStoredAction();
		Variable var = facT.createVariable();
		var.setVariableDeclaration(varDecl);
		actionV.setVariable(var);
		
		BooleanConstant term = facT.createBooleanConstant();
		term.setValue(!initial);
		actionV.setValue(term);
		
		ActionLink actLink = facG.createActionLink();
		actLink.setStep(step);
		actLink.setActionType(actionV);
		
		grafcet.getSteps().add(step);
		grafcet.getActionLinks().add(actLink);
		grafcet.getActionTypes().add(actionV);
		
		return step;
	}
	
	private void transformSynchronization() {
		//TODO: HIer wird noch nicht gepr�ft, ob eien stabile Situation vorliegt
		PartialGrafcet gSync = facG.createPartialGrafcet();
		
		sProcess = facG.createStep(getId());
		sProcess.setInitial(true);
		sControl = facG.createStep(getId());
		gSync.getSteps().add(sProcess);
		gSync.getSteps().add(sControl);
		
		VariableDeclaration varSyncDecl = createVariableDeclaration("nSync", VariableDeclarationType.INPUT);
		Variable varSync = createVariable(varSyncDecl);
		Transition t1 = facG.createTransition();
		t1.setId(getId());
		t1.setTerm(varSync);
		
		Transition t2 = facG.createTransition();
		t2.setId(getId());
		Not tNot = facT.createNot();
		Variable varSync2 = facT.createVariable();
		varSync2.setVariableDeclaration(varSyncDecl);
		tNot.getSubterm().add(varSync2);
		t2.setTerm(tNot);
		
		generateArc(sProcess, t1, gSync);
		generateArc(t1, sControl, gSync);
		generateArc(sControl, t2, gSync);
		generateArc(t2, sProcess, gSync);
		
		gSync.getSteps().add(sProcess);
		gSync.getSteps().add(sControl);
		gSync.getTransitions().add(t1);
		gSync.getTransitions().add(t2);
		
		gSync.setName("gSync");
		gTransformed.getPartialGrafcets().add(gSync);
		
	}
	
	/**
	 * Generates a partial Grafcet that initializes the partial Grafcets for the process and the control to ensure a semantically realistic initialization
	 */
	private void transformInitilializationProcess() {
		PartialGrafcet gInit = facG.createPartialGrafcet();
		
		Step sInit = facG.createStep(getId());
		sInit.setInitial(true);
		EnclosingStep sControl = facG.createEnclosingStep();
		sControl.setId(getId());
		EnclosingStep sProcess = facG.createEnclosingStep();
		sProcess.setId(getId());
		sControl.getPartialGrafcets().add(gControlNew);
		sProcess.getPartialGrafcets().add(gProcessNew);
		gControlNew.setEnclosingStep(sControl);
		gProcessNew.setEnclosingStep(sProcess);
		Step sWarte1 = facG.createStep(getId());
		Step sWarte2 = facG.createStep(getId());
		
		gInit.getSteps().add(sInit);
		gInit.getSteps().add(sControl);
		gInit.getSteps().add(sProcess);
		gInit.getSteps().add(sWarte1);
		gInit.getSteps().add(sWarte2);
		
		BooleanConstant tTrue1 = facT.createBooleanConstant();
		tTrue1.setValue(true);
		Transition t1 = createTransitionFromTerm(getId(), gInit, tTrue1);
		
		BooleanConstant tTrue2 = facT.createBooleanConstant();
		tTrue2.setValue(true);
		Transition t2 = createTransitionFromTerm(getId(), gInit, tTrue2);
		
		BooleanConstant tTrue3 = facT.createBooleanConstant();
		tTrue3.setValue(true);
		Transition t3 = createTransitionFromTerm(getId(), gInit, tTrue3);
		
		Synchronization sync1 = facG.createSynchronization();
		gInit.getSynchronizations().add(sync1);
		
		createArc(gInit, sInit, t1);
		createArc(gInit, t1, sync1);
		createArc(gInit, sync1, sProcess);
		createArc(gInit, sync1, sWarte1);
		createArc(gInit, sWarte1, t2);
		createArc(gInit, t2, sWarte2);
		createArc(gInit, sWarte2, t3);
		createArc(gInit, t3, sControl);
		
		for (InitializableType step : gProcessNew.getSteps()) {
			if (step.isInitial()) {
				step.setInitial(false);
				step.setActivationLink(true);
			}
		}
		for (InitializableType step : gControlNew.getSteps()) {
			if (step.isInitial()) {
				step.setInitial(false);
				step.setActivationLink(true);
			}
		}
		gInit.setName("gInit");
		gTransformed.getPartialGrafcets().add(gInit);
	}
	
	private void transformTransitionConditionsProcessAndControl() {
		VariableDeclaration xSProcessDecl = createVariableDeclaration("XSProcess", sProcess);
		for (Transition transition : gProcessNew.getTransitions()) {
			Term oldTerm = transition.getTerm();
			And newTerm = facT.createAnd();
			RisingEdge edge = facT.createRisingEdge();
			Variable xSProcess = createVariable(xSProcessDecl);
			edge.getSubterm().add(xSProcess);
			newTerm.getSubterm().add(oldTerm);
			newTerm.getSubterm().add(edge);
			transition.setTerm(newTerm);
		}
		for (Transition transition : gControlNew.getTransitions()) {
			Term oldTerm = transition.getTerm();
			And newTerm = facT.createAnd();
			Variable xSProcess = createVariable(xSProcessDecl);
			newTerm.getSubterm().add(oldTerm);
			newTerm.getSubterm().add(xSProcess);
			transition.setTerm(newTerm);
		}
	}
	
	private void createArc(PartialGrafcet g, Node source, Node traget) {
		Arc arc1 = facG.createArc();
		arc1.setSource(source);
		arc1.setTarget(traget);
		g.getArcs().add(arc1);
	}
	
	private PartialGrafcet transformGrafcetVariants(PartialGrafcet gOld) throws UnsupportedOperationException {
		PartialGrafcet gNew = facG.createPartialGrafcet();		
		//shallow copy:
		gNew.getTransitions().addAll(gOld.getTransitions());
		for (Transition trans : gNew.getTransitions()) {
			int newId = trans.getId() + 100;
			trans.setId(newId);
		}
		gNew.getArcs().addAll(gOld.getArcs());
		gNew.getSynchronizations().addAll(gOld.getSynchronizations());
		gNew.getMacrosteps().addAll(gOld.getMacrosteps());
		gNew.getActionTypes().addAll(gOld.getActionTypes());
		gNew.getActionLinks().addAll(gOld.getActionLinks());
		gNew.getSteps().addAll(gOld.getSteps());
		for (InitializableType step : gNew.getSteps()) {
			int newId = step.getId() + 100;
			step.setId(newId);
		}
		if(gNew.getPartialGrafcets().size() != 0) {
			throw new UnsupportedOperationException("A Process Grafcet should not contain partial Grafcets");
		}	
		gTransformed.getPartialGrafcets().add(gNew);
		return gNew;
	}
	
	
	private VariableDeclaration createVariableDeclaration(String varName, InitializableType step) {
		VariableDeclaration varDecl = createVariableDeclaration(varName, VariableDeclarationType.STEP);
		varDecl.setStep(step);
		return varDecl;
	}
	
	private VariableDeclaration createVariableDeclaration(String varName, VariableDeclarationType type) {
		VariableDeclaration varDecl = facT.createVariableDeclaration();
		varDecl.setName(varName);
		varDecl.setVariableDeclarationType(type);
		gTransformed.getVariableDeclarationContainer().getVariableDeclarations().add(varDecl);
		return varDecl;
	}
	
	private int getId() {
		id ++;
		return id;
	}
	
//Diskussion mit Kowalewski war, dass man vorraussetzen kann, dass die Steuerung in einem Initialen Zustand ist. Der muss dann in gProcess modelliert sein
//	private Transition createTransitionFromInputVar(PartialGrafcet containingPG, List<VariableDeclaration> inputVars) {
////		int size = inputVars.size();
////		List<VariableDeclaration> reminaingVars = new ArrayList<VariableDeclaration>(inputVars);
//		
//		Term root = null;
//		And parentAnd = null;
//		for (int i = 0; i < inputVars.size(); i++) {
//			boolean isTrue = isVariableTrue(i, countTransition);
//			Term var = createNegatedVariable(inputVars.get(i), isTrue);
//			if (i < inputVars.size() - 1) {
//				And and = facT.createAnd();
//				and.getSubterm().add(var);
//				if (parentAnd!= null) {
//					parentAnd.getSubterm().add(and);
//				} else {
//					root = and;
//				}
//				parentAnd = and;
//			} else {
//				if (parentAnd != null) {
//					parentAnd.getSubterm().add(var);
//				} else {
//					root = createVariable(inputVars.get(i));
//				}
//			}
//		}
//
//		Transition t = createTransitionFromTerm(countTransition + 1, containingPG, root);
//		countTransition++;
//		return t;
//	}

	
	private Transition createTransitionFromTerm(int id, PartialGrafcet containingPG, Term term) {
		Transition t = facG.createTransition();
		t.setId(id);
		containingPG.getTransitions().add(t);
		t.setTerm(term);
		return t;
	}
	
	private Term createNegatedVariable(VariableDeclaration vd, boolean isNegated) {
		Variable variable = createVariable(vd);
		if(isNegated) {
			Not not = facT.createNot();
			not.getSubterm().add(variable);
			return not;
		} else {
			return variable;
		}
	}
	private Variable createVariable(VariableDeclaration vd) {
		Variable v = facT.createVariable();
		v.setVariableDeclaration(vd);
		return v;
	}
	
	private boolean isVariableTrue(int variableCount, int transitionCount) {
		String binaryString = java.lang.Integer.toBinaryString(transitionCount);
//		System.out.println(binaryString);
		char[] c = binaryString.toCharArray();
		if(c.length <= variableCount) {
			return false;
		}
		if (c[c.length - variableCount - 1] == '1') {
//				System.out.println(c[variableCount] + " - " + true);
			return true;
		} else if (c[c.length - variableCount - 1] == '0') {
//				System.out.println(c[variableCount] + " - " + false);
			return false;
		} else {
			throw new IllegalArgumentException("Error in Algorithm");
		}
	}
	
}






