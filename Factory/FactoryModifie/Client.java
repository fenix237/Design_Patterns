package Design_Patterns.Factory.FactoryModifie;

import Design_Patterns.Factory.FactoryModifie.Produit.ProduitA;
import Design_Patterns.Factory.FactoryModifie.ProduitFactory.ProduitFactory;
import Design_Patterns.Factory.FactoryModifie.ProduitFactory.ProduitFactory1;
import Design_Patterns.Factory.FactoryModifie.ProduitFactory.ProduitFactory2;
import Design_Patterns.Factory.FactoryModifie.ProduitFactory.ProduitFactory3;

public class Client {
    public static void main(String[] args){
        ProduitFactory produitFactory1=new ProduitFactory1();
        ProduitFactory produitFactory2=new ProduitFactory2();
        ProduitFactory produitFactory3=new ProduitFactory3();
        
        ProduitA produitA=null;

        System.out.println("\nFACTORY MODIFIE\n");

        System.out.println("\n*****************************");
        
        System.out.println("\nUtilisation de la premiere fabrique");
        produitA=produitFactory1.getProduitA();
        produitA.methodeA();

        System.out.println("\n*****************************");

        System.out.println("\nUtilisation de la seconde fabrique");
        produitA=produitFactory2.getProduitA();
        produitA.methodeA();

        System.out.println("\n*****************************");

        System.out.println("\nUtilisation de la troisieme fabrique");
        produitA=produitFactory3.getProduitA();
        produitA.methodeA();

        System.out.println("\n*****************************\n");

       
    
    }   
}

