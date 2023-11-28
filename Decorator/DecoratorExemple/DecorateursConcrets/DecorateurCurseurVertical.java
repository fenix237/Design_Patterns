package Design_Patterns.Decorator.DecoratorExemple.DecorateursConcrets;

import Design_Patterns.Decorator.DecoratorExemple.ComposantAbstrait.Fenetre;
import Design_Patterns.Decorator.DecoratorExemple.Decorateur.DecorateurFenetre;

public class DecorateurCurseurVertical extends DecorateurFenetre{

    public DecorateurCurseurVertical(Fenetre fenetre) {
        super(fenetre);
      
    }
    public void dessiner(){
        System.out.println("Dessin de la fenetre");
    }
    public void decrire(){
        System.out.println("Description de la fenetre");

    }
    public void dessinerCurseurVertical(){
        System.out.println("Ajout curseur vertical");
    }

    
    
}
