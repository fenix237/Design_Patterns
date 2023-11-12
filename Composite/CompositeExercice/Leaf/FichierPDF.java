package Design_Patterns.Composite.CompositeExercice.Leaf;

public class FichierPDF extends Fichier{
   private String nom;
   private String type = "PDF";
    
    public FichierPDF(String nom) {
        this.nom = nom;
        
    }

    public void decrire(){

        System.out.println("\n le nom du fichier est :"+this.nom);
        System.out.println("le type d'element est: "+type);

    }
    
}
