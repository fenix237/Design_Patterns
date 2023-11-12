package Design_Patterns.Composite.CompositeExercice.Leaf;

public class FichierTXT extends Fichier{
   private String nom;
   private String type = "TXT";
    
    public FichierTXT(String nom) {
        this.nom = nom;
        
    }

    public void decrire(){

        System.out.println("\n le nom du fichier est :"+this.nom+"\n");
        System.out.println("\nle type d'element est: "+type+"\n");

    }
    
}
