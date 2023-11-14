package Design_Patterns.Composite.CompositeExercice;

import Design_Patterns.Composite.CompositeExercice.Component.ElementSystem;
import Design_Patterns.Composite.CompositeExercice.Composite.Dossier;
import Design_Patterns.Composite.CompositeExercice.Leaf.Fichier;
import Design_Patterns.Composite.CompositeExercice.Leaf.FichierPDF;
import Design_Patterns.Composite.CompositeExercice.Leaf.FichierTXT;

public class Client {

    public static void main(String[] args) {
        System.out.println("\n\nPatron composite exercice\n\n");

        System.out.println("\n****************************************\n");

        System.out.println("\nCreation d'un fichier PDF\n");

        Fichier fichierPdf = new FichierPDF("first_File_Pdf");
        fichierPdf.decrire();

        System.out.println("\nCreation d'un fichier TXT\n");

        Fichier fichierTxt = new FichierTXT("first_file_Txt");
        fichierTxt.decrire();

        System.out.println("\n**************************\n");   

        System.out.println("\nInsertion des fichier dans un dossier\n");

        ElementSystem dossier = new Dossier("Les fichiers");

        dossier.ajouter(fichierPdf);
        
        dossier.ajouter(fichierTxt);

        System.out.println("\n**************************\n"); 
        System.out.println("\nDescription du dossier\n");   
        dossier.decrire();


        System.out.println("\n**********************************\n");

        System.out.println("\nObtention de l'elemet i\n");
        ElementSystem file = dossier.obtenir(1);
        file.decrire();

        System.out.println("\n****************************\n");
       System.out.println("\nCreation d'un sous dosier et insertion dans le dosssier principal\n");

        ElementSystem sousdossier = new Dossier("sous dossier");
        dossier.ajouter(sousdossier);

        System.out.println("\n*******************************************\n");

        System.out.println("\nDerniere description du dossier\n");
        dossier.decrire();

        System.out.println("\n\n*******************************************************\n\n");
    }
    
}
