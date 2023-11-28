package Design_Patterns.Decorator.DecoratorExemple.Decorateur;

import Design_Patterns.Decorator.DecoratorExemple.ComposantAbstrait.Fenetre;

public abstract class DecorateurFenetre implements Fenetre {

    protected Fenetre fenetreDecoree;
    public DecorateurFenetre(Fenetre fenetre){

    }
    
}
