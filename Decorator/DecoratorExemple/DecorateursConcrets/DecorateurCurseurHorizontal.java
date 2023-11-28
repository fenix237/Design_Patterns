package Design_Patterns.Decorator.DecoratorExemple.DecorateursConcrets;

import Design_Patterns.Decorator.DecoratorExemple.ComposantAbstrait.Fenetre;
import Design_Patterns.Decorator.DecoratorExemple.Decorateur.DecorateurFenetre;

public class DecorateurCurseurHorizontal extends DecorateurFenetre{

    public DecorateurCurseurHorizontal(Fenetre fenetre) {
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
        System.out.println("  Avec ajout du curseur horizontal");


    }
    public void dessinerCurseur(){
        System.out.println("Ajout curseur horizontal");
    }

    
    
}
