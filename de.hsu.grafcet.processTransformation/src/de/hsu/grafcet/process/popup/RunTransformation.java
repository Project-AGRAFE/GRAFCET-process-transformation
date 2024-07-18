package de.hsu.grafcet.process.popup;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import de.hsu.grafcet.*;

import de.hsu.grafcet.Grafcet;
import de.hsu.grafcet.process.ProcessTransformation;

public class RunTransformation implements IObjectActionDelegate{

	private Shell shell;
	protected List<IFile> files;	
	private Grafcet selectedGrafcet;
	private int analysis;
	private String message = "Checking was executed.";
	
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	@Override
	public void run(IAction arg0) {
		if (files != null) {

			//TEST MessageDialog:
			//			try {
//				analysis = MessageDialog.open(MessageDialog.QUESTION, shell, 
//						"Choose properties to analyze.", 
//						"Message", 0, "", "2", "3", "4", "5", "6");
//			} catch (Exception e) {
//				e.printStackTrace();
//			}

			
			IRunnableWithProgress operation = new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {
					try {
						Iterator<IFile> filesIt = files.iterator();
						while (filesIt.hasNext()) {
													
							IFile model = (IFile)filesIt.next();
							URI modelURI = URI.createPlatformResourceURI(model.getFullPath().toString(), true);
							IContainer target = model.getProject().getFolder("Transformation_Process");
							try {
								ResourceSet resSet = new ResourceSetImpl();
								Resource res = resSet.getResource(modelURI,	true);
								
								ProcessTransformation pt = new ProcessTransformation((Grafcet)res.getContents().get(0));
								Grafcet gOut = pt.getTransformedGrafcet();
																
								URI targetURI = URI.createFileURI(target.getLocation().toString()+ "/TransProcess_" + model.getName());

//								EcoreUtil.resolveAll(res);
								
								Resource xmiResource = resSet.createResource(targetURI);
								xmiResource.getContents().add(gOut);
								
								try {
								  xmiResource.save(null);
								} catch (IOException e) {
								    e.printStackTrace();
								}
								
							} catch (Exception e) {
//								Util.createOutputFile("Error: " + e, target.getLocation().toString() + "/Result_AI_veri_" + model.getName().substring(0, model.getName().lastIndexOf(".grafcet")) + ".txt");
								message = "ERROR: Please inspect console log for details.";
								e.printStackTrace();
							}finally {
//								Util.createOutputFile("Error", target.getLocation().toString() + "/Result_AI_veri_" + model.getName().substring(0, model.getName().lastIndexOf(".grafcet")) + ".txt");
								model.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
							}
						}
					} catch (CoreException e) {
						IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
						Activator.getDefault().getLog().log(status);
					}
				}
			};
			try {
				PlatformUI.getWorkbench().getProgressService().run(true, true, operation);
			} catch (InvocationTargetException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			} catch (InterruptedException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			}
		}
		MessageDialog.openInformation(
				shell,
				"Actions",
				message);
		
	}
	
	
	

	
	

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	@SuppressWarnings("unchecked")
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			files = ((IStructuredSelection) selection).toList();
		}
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	
	
}