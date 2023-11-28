package Design_Patterns.Decorator.DecoratorExemple;

import Design_Patterns.Decorator.DecoratorExemple.ComposantAbstrait.Fenetre;
import Design_Patterns.Decorator.DecoratorExemple.ComposantConcret.FenetreSimple;
import Design_Patterns.Decorator.DecoratorExemple.Decorateur.DecorateurFenetre;
import Design_Patterns.Decorator.DecoratorExemple.DecorateursConcrets.DecorateurCurseurHorizontal;
import Design_Patterns.Decorator.DecoratorExemple.DecorateursConcrets.DecorateurCurseurVertical;

public class Client {
    public static void main(String[] args) {

        System.out.println("\n\nPATRON DECORATOR EXEMPLE\n\n");

        System.out.println("Creation d'une fenetre simple\n");

        Fenetre fenetreSimple=new FenetreSimple();
        fenetreSimple.dessiner();
        fenetreSimple.decrire();

        System.out.println("\n******************************\n");

        System.out.println("Defilement horizontal de la 1ere fenetre cree\n");

        DecorateurFenetre defilementHorizontal = new DecorateurCurseurHorizontal(fenetreSimple);
        defilementHorizontal.dessiner();
        defilementHorizontal.decrire();

        System.out.println("\n*******************************\n");

        System.out.println("Defilement vertical de la 1ere fenetre cree\n");

        DecorateurFenetre defilementVertical = new DecorateurCurseurVertical(fenetreSimple);
        defilementVertical.dessiner();
        defilementVertical.decrire();

        System.out.println("\n******************************\n");

        System.out.println("Attribution des 2 defilements a la 1ere fenetre cree\n");

        DecorateurFenetre doubleDefilement = new DecorateurCurseurVertical(defilementHorizontal);
        doubleDefilement.dessiner();
        doubleDefilement.decrire();

        System.out.println("\n\n************************************\n\n");

    }
}
