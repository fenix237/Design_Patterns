package Design_Patterns.Composite.CompositeExemple;

import Design_Patterns.Composite.CompositeExemple.Composite.Section;
import Design_Patterns.Composite.CompositeExemple.Leaf.Paragraphe;

public class Client {
    public static void main(String[] args){

        System.out.println("\n\nPatron composite exemple\n\n");

        System.out.println("\n******************************\n");
        
        Paragraphe paragraphe=new Paragraphe();
        paragraphe.longueur();

        System.out.println("\n******************************\n");

        Section section = new Section();
        section.ajout(paragraphe);

        System.out.println("\n******************************\n");
        section.longueur();

        System.out.println("\n******************************\n");
        section.retrait(1);
        
        System.out.println("\n******************************\n");


    }
    
}
