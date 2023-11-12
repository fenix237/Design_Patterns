package Design_Patterns.Composite.CompositeExemple.Leaf;

import Design_Patterns.Composite.CompositeExemple.Component.Texte;

public class Paragraphe extends Texte{
    
    int longueur=15;
    

    public void  longueur(){
       System.out.println("Affichage de la longueur: "+longueur);
    }
    
}
