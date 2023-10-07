package Design_Patterns.FactoryMethod.FactoryMethodDeBase;

import Design_Patterns.FactoryMethod.FactoryMethodDeBase.Produit.ProduitA;
import Design_Patterns.FactoryMethod.FactoryMethodDeBase.ProduitFactory.ProduitFactory;

public class Client {
    public static void main(String[] args){
        ProduitFactory produitFactory=new ProduitFactory();
        
        ProduitA produitA=null;

        System.out.println("\nFACTORY METHODE DE BASE\n");

        System.out.println("\n*****************************");

        produitA=produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA1);
        produitA.methodeA();

        produitA=produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA2);
        produitA.methodeA();


        produitA=produitFactory.getProduitA(4);
        produitA.methodeA();

        System.out.println("\n*****************************\n");
    
    }   
}
