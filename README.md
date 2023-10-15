

# DESIGN PATTERNS: PATRONS DE CONSTRUCTION

Ce projet illustre l'utilisation de différents patrons de construction dans le développement d'applications. Chaque patron dispose d'une version de base et une version modifie.Parmi eux nous avons: le factory, le factory method, l'abstract factory, le builder et le singleton


## Factory 

### Description
 Le Factory permet de creer un objet dont le type depend du contexte, utilisé lorsqu'à l'execution il est necessaire de determiner dynamiquement quel objet d'un ensemble de sous classes doit etre instancier

### Participants

- ProduitFactory:  Classe abstraite qui abrite la signature de la méthode de fabrique et l’implémentation des méthodes qui invoquent cette méthode de fabrique
- ProduitFactory1 et ProduitFactory2: Classe concrète qui implémente la méthode fabrique. On peut avoir plusieurs fabriques concrètes
- ProduitA: classe abstraite dont les sous-classes sont instanciees
- ProduitA1 et ProduitA2: les sous classes conccetes a instancier
- Client: le classe(programme) qui fait appel à la fabrique pour lui
fournir des objets de type Produit 

### Structure

- Version de Base : La version de base du patron est située dans le répertoire Factory/FactoryDeBase.
- Version Modifiée : La version modifiée du patron est située dans le répertoire Factory/FactoryModifie.

### Exécution

Pour executer le programme, 
1. s'assurer d'avoir installe java
et de l'avoir mi dans les variables d'environnement
2. Aller dans votre IDE java prefere
3. aller au repertoir du factory souhaite (de base ou modifie),puis dans le fichier Client
4. cliquer sur Run



## FactoryMethod 

### Description
 Le FactoryMethod tout comme le Factory permet de creer un objet dont le type depend du contexte. Il déclarer une fabrique avec une méthode de création de l’objet qui attend les données nécessaires pour déterminer le type de l’objet à créer.

### Participants

- ProduitFactory: la classe qui définit la méthode de création d’objets
- ProduitA: classe abstraite dont les sous-classes sont instanciees
- ProduitA1 et ProduitA2: les sous classes concretes a instancier
- Client: le classe(programme) qui fait appel à la fabrique pour lui
fournir des objets de type Produit 

### Structure

- Version de Base : La version de base du patron est située dans le répertoire FactoryMethod/FactoryMethodDeBase.
- Version Modifiée : La version modifiée du patron est située dans le répertoire FactoryMethod/FactoryMethodModifie.

### Exécution

Pour executer le programme, 
1. s'assurer d'avoir installe java
et de l'avoir mi dans les variables d'environnement
2. Aller dans votre IDE java prefere
3. aller au repertoire du factoryMethod souhaite (de base ou modifie),puis dans le fichier Client
4. cliquer sur Run


## AbstractFactory 

### Description
 L' abstract factory permet de creer des objets regroupés en familles sans avoir à connaître leurs classes concrètes. Il peremt de fournir une interface unique pour instancier des objets uniques d'une meme famille sans avoir a connaitre les clases a instancier.

### Participants

- FabriqueAbstraite: interface spécifiant les signatures des méthodes créant les différents objets
- FabriqueConcrete1 et FabriqueConcrete2: classes implémentant les méthodes de création d’objets. Connaissent les familles et les produits, capable de créer une instance d’un produit pour une famille
- ProduitA et produit B: interfaces (ou classes abstraites) des produits indépendamment de leur famille.
- ProduitA1 et ProduitA2: introduisent les familles de produits
- Client: le classe(programme) qui fait appel à la fabrique pour lui
fournir des objets de type Produit 

### Structure

- Version de Base : La version de base du patron est située dans le répertoire AbstracFactory/AbstracFactoryDeBase.
- Version Modifiée : La version modifiée du patron est située dans le répertoire AbstracFactory/AbstracFactoryModifie.

### Exécution

Pour executer le programme, 
1. s'assurer d'avoir installe java
et de l'avoir mi dans les variables d'environnement
2. Aller dans votre IDE java prefere
3. aller au repertoire du AbstractFactory souhaite (de base ou modifie),puis dans le fichier Client
4. cliquer sur Run


## Auteur

Indiquez ici votre nom ou le nom de votre équipe.

