package Design_Patterns.Composite.CompositeExercice.Leaf;

import Design_Patterns.Composite.CompositeExercice.Component.ElementSystem;

public class FichierPDF extends Fichier{
   private String nom;
   private String type = "PDF";
    
    public FichierPDF(String nom) {
        this.nom = nom;
        
    }

    public void decrire(){

        System.out.println("le nom du fichier est :"+this.nom);
        System.out.println("le type d'element est: "+type);

    }

   
    public void ajouter(ElementSystem element) {
        System.out.println("Ajout impossible");
    }

    
    public void supprimer(ElementSystem element) {
       System.out.println("Suppression impossible");
    }

    
    public ElementSystem obtenir(int i) {
        System.out.println("Obtention impossible");
        return null;
    }
    
}
