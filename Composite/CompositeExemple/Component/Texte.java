package Design_Patterns.Composite.CompositeExemple.Component;

import Design_Patterns.Composite.CompositeExemple.Composite.Section;

public abstract class Texte {

   private String titre;
   private String preambule;
   protected Section sousSection;

   public abstract void longueur();

   public  void ajout(Texte texte){
        

   }

   
   public  void retrait(int index){

   }
    
}
