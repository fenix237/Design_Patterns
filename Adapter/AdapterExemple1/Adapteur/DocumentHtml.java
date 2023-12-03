package Design_Patterns.Adapter.AdapterExemple1.Adapteur;

import Design_Patterns.Adapter.AdapterExemple1.Interface.Document;

public class DocumentHtml implements Document{

    public void setContenu(String contenu){
        System.out.println("affichage du conenu");
   }

   public void dessine(){
       System.out.println("dessin");
   }

   public void imprime(){
       System.out.println("impression");
   }
}
