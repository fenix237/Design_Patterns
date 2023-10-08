package Design_Patterns.FactoryMethod.FactoryMethodModifie;

import Design_Patterns.FactoryMethod.FactoryMethodModifie.ProduitFactory.ProduitFactory;
import Design_Patterns.FactoryMethod.FactoryMethodModifie.Produit.ProduitA;

public class Client {
    public static void main(String[] args){
        ProduitFactory produitFactory=new ProduitFactory();
        
        ProduitA produitA=null;

        System.out.println("\nFACTORY METHODE MODIFIE");

        System.out.println("\n*****************************");

        produitA=produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA1);
        produitA.methodeA();

        produitA=produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA2);
        produitA.methodeA();

        produitA=produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA3);
        produitA.methodeA();

        produitA=produitFactory.getProduitA(4);
        produitA.methodeA();

        System.out.println("\n*****************************\n");
    
    }   
}
