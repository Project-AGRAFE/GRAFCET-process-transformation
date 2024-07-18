# GRAFCET-process-transformation
Model-to-model transformation of a process variant of GRAFCET into IEC 60848 GRAFCET


## Installation
* Set up the GRAFCET-Editor: https://github.com/Project-AGRAFE/GRAFCET-editor
* Import this Eclipse projekt (https://github.com/Project-AGRAFE/GRAFCET-process-transformation/tree/main/de.hsu.grafcet.processTransformation) into the same Eclipse workspace as the editor project files (https://github.com/Project-AGRAFE/GRAFCET-editor/tree/main/project).

## Create a Process Variant of Grafcet
* run the editor and create a .grafcet file (in a modeling projcet: New --> Other --> Example EMF Creation Wizards --> Grafcet Model)
* the .grafcet file will oben in the model editor
* right click the Grafcet model --> New Child and manually add a Process Grafcet and a Control Grafcet

## Running the Transformation
* right click on the .grafcet file --> GRAFCET --> Transformation Process Grafcet
* a folder will be created containing the transformation output


## Publications
@misc{Schnakenbeck24,
  title = {Ansätze für die Modellierung von Streckeninformationen zur Verifikation im Steuerungsentwurf},
  author = {Schnakenbeck, Aron and Mroß, Robin and Völker, Marcus and Kowalewski, Stefan and Fay, Alexander},
  year = {2024},
  url = {http://dx.doi.org/10.25673/116044},
  urn = {urn:nbn:de:gbv:ma9:1-1981185920-1180005},
}
