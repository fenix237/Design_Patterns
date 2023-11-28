package Design_Patterns.Decorator.DecoratorExemple.ComposantConcret;

import Design_Patterns.Decorator.DecoratorExemple.ComposantAbstrait.Fenetre;

public class FenetreSimple implements Fenetre{
    public void dessiner(){
        System.out.println("Dessin de la fenetre");
    }
    public void decrire(){
        System.out.print("Ici c'est la description de la fenetre ");

    }
}
