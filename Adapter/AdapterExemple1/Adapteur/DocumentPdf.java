package Design_Patterns.Adapter.AdapterExemple1.Adapteur;

import Design_Patterns.Adapter.AdapterExemple1.Adapte.ComposantPdf;
import Design_Patterns.Adapter.AdapterExemple1.Interface.Document;

public class DocumentPdf implements Document{
    
   

       ComposantPdf composantPdf = new ComposantPdf();

    public void setContenu(String contenu){
         composantPdf.pdfFixeContenu(contenu);
    }

    public void dessine(){
        System.out.println("dessin");
    }

    public void imprime(){
        composantPdf.pdfEnvoieImprimante();
    }

}
