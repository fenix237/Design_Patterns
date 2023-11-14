package Design_Patterns.Composite.CompositeExercice.Leaf;

import Design_Patterns.Composite.CompositeExercice.Component.ElementSystem;

public abstract  class Fichier implements ElementSystem{
    private String nom;
    private String type;

    public abstract void  decrire();

}
