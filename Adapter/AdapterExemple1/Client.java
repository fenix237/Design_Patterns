package Design_Patterns.Adapter.AdapterExemple1;

import Design_Patterns.Adapter.AdapterExemple1.Adapteur.DocumentPdf;
import Design_Patterns.Adapter.AdapterExemple1.Interface.Document;

public class Client {
    public static void main(String[] args) {

        System.out.println("\nPATRON ADAPTER Cas de L'exemple 1\n\n");
        Document documentPdf = new DocumentPdf();
        documentPdf.setContenu("Contenu du document pdf");
        documentPdf.dessine();
        documentPdf.imprime();

        System.out.println("\n\n*********************\n\n");

    }
}
