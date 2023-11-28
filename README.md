# DESIGN PATTERNS: PATRONS DE STRUCTURATION

Ce projet illustre l'utilisation de différents patrons de construction dans le développement d'applications. Chaque patron dispose d'une version de base et une version modifie.Parmi eux nous avons: le factory, le factory method, l'abstract factory, le builder et le singleton


## Adapter 

### Description
 Le Patron Adaptater permet de convertir l’interface d’une classe existante en un autre attendue par le client également existants afin qu’ils
 puissent travailler ensemble, c'est a dire confier a une classe existente une nouvelle interface pour repondre aux besoins du client.

### Participants

- Stack: qui introduit la signature des methodes de l'objet
- DlistImpStack: Implemente les methodes de l'interface en invoquant les methodes de l'objet adapte
- Dlist: l’objet dont l’interface doit être adaptée pour
correspondre a Interface.
- Client: programme ou classe qui interagit avec les objets
répondant à interface
- Objet: type d'element instancie dans la classe adapte


### Structure

- Version de Base : La version de l'exemple 2 de base du patron est située dans le répertoire Adapter/AdapterExemple2DeBase.
- Version Modifiée : La version modifiée du patron est située dans le répertoire Adapter/AdapterExemple2Modifie.

### Exécution

Pour executer le programme, 
1. s'assurer d'avoir installe java
et de l'avoir mi dans les variables d'environnement
2. Aller dans votre IDE java prefere
3. aller au repertoir du factory souhaite (de base ou modifie),puis dans le fichier Client
4. cliquer sur Run


## Composite 

### Description
 Le Patron Composite permet de combiner des objets en structures plus grandes. Il decrit une facon de traiter de la meme maniere les objets simples et les objets composites

### Participants

- Texte: Declare l'interface commune a tous les objets ainsi que le comportement par defaut pour toutes les classes
- Section: définit le comportement des composants ayant des
fils, stocke les fils et implémente les opérations nécessaires à leur gestion.
-Paragraphe: Implememnnte le comportement elementaire


### Structure

- Version de Base : La version de l'exemple 2 de base du patron est située dans le répertoire Composite/CompositeEx.
- Version Modifiée : La version modifiée du patron est située dans le répertoire Adapter/AdapterExemple2Modifie.

### Exécution

Pour executer le programme, 
1. s'assurer d'avoir installe java
et de l'avoir mi dans les variables d'environnement
2. Aller dans votre IDE java prefere
3. aller au repertoir du factory souhaite (de base ou modifie),puis dans le fichier Client
4. cliquer sur Run


## Bridge 

### Description
 Le Patron Bridge découpler l’interface d’une classe et son
implémentation, permettant à l'interface et l'implementation de varier séparément.

### Participants

- Abstraction:  définit l’interface de l’abstraction; gère une référence
à un objet de type implémentation.
- RefineAbstration: enrichit l’interface définie par l’abstraction pour
constituer une classe concrète
- Implementor: définit l’interface commune pour toutes les
implémentations concrètes. En général elle définit des opérations
primitives
- ConcreteImplementor: réalise concrètement l’implémentation de
l’interface.
- bridge: lien d’association qui fait le pont entre l’abstraction et
l’implémentation.


### Structure

- Version de Base : La version de l'exemple de base du patron est située dans le répertoire Bridge/BridgeExemple.
- Version Modifiée : La version modifiée du patron est située dans le répertoire Bridge/BridgeExempleModifie et Bridge/BridgeExempleModifie2

### Exécution

Pour executer le programme, 
1. s'assurer d'avoir installe java
et de l'avoir mi dans les variables d'environnement
2. Aller dans votre IDE java prefere
3. aller au repertoir du bridge souhaité (de base ou modifie),puis dans le fichier Bridge(Modifie)DesignPatternMain.java
4. cliquer sur Run

