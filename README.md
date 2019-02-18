# Interprétation des Langages

## Smart Home Data Fusion DSL

### Installation

- Ouvrir le dossier `smart_house` en tant que workspace Eclipse
- File → Import → Existings projects
- Sélectionner le dossier `smart_house`

### Lancement de l'exemple

- Lancer la configuration Eclipse `SmartHome Runtime Eclipse` présente dans le dossier `smart_house/fr.unice.polytech.idm.language/launch_configuration`
- Dans le _runtime Eclipse_, importer le projet `TestProject` présent dans le dossier `runtime-EclipseXtext`
- Lancer la configuration Eclipse `SmartHome launch test program` présente dans le dossier `runtime-EclipseXtext/TestProject`

**Note :**
Pour que l'exemple fonctionne, il faut insérer pour chaque capteur le fichier contenant les données qu'il envoie.
Des fichiers d'exemple sont présents dans le dossier `custom-dataset` à la racine du projet.

Exemple :

```
IntegerSensor temp1 TEMPERATURE ("")
```

Devient :
```
IntegerSensor temp1 TEMPERATURE ("<chemin>/temp1.csv")
```
