package Design_Patterns.Decorator.DecoratorExemple.DecorateursConcrets;

import Design_Patterns.Decorator.DecoratorExemple.ComposantAbstrait.Fenetre;
import Design_Patterns.Decorator.DecoratorExemple.Decorateur.DecorateurFenetre;

public class DecorateurCurseurHorizontal extends DecorateurFenetre{

    public DecorateurCurseurHorizontal(Fenetre fenetre) {
        super(fenetre);
      
    }
    public void dessiner(){
        System.out.println("Dessin de la fenetre");
    }
    public void decrire(){
        System.out.println("Description de la fenetre");

    }
    public void dessinerCurseurHorizontal(){
        System.out.println("Ajout curseur horizontal");
    }

    
    
}
