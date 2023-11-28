package Design_Patterns.Decorator.DecoratorExemple.DecorateursConcrets;

import Design_Patterns.Decorator.DecoratorExemple.ComposantAbstrait.Fenetre;
import Design_Patterns.Decorator.DecoratorExemple.Decorateur.DecorateurFenetre;

public class DecorateurCurseurVertical extends DecorateurFenetre{

    public DecorateurCurseurVertical(Fenetre fenetre) {
        super(fenetre);
      
    }
    @Override
    public void dessiner(){
        super.dessiner();
        dessinerCurseur();
       
    }
    @Override
    public void decrire(){
        super.decrire();
        System.out.println("Avec defilement vertical");


    }
    public void dessinerCurseur(){
        System.out.println("Dessin du curseur vertical");
    }

    
    
}
