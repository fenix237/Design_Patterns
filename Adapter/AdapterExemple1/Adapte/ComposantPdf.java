package Design_Patterns.Adapter.AdapterExemple1.Adapte;

public class ComposantPdf {

    public void pdfFixeContenu(String contenu){
        System.out.println("fixage du contenu: "+contenu);
    }
    
    public void pdfPrepareAffichage(){
        System.out.println("Preparation de l'affichage");
    }

    public void pdfRafraichir(){
        System.out.println("Rafraichisssement");
    }

    public void pdfTermineAffichage(){
        System.out.println("Terminaison de l'affichage");
    }

    public void pdfEnvoieImprimante(){
        System.out.println("Envois imprimante");
    }

}
