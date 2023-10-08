package Design_Patterns.Factory.FactoryDeBase;

import Design_Patterns.Factory.FactoryDeBase.Produit.ProduitA;
import Design_Patterns.Factory.FactoryDeBase.ProduitFactory.ProduitFactory;
import Design_Patterns.Factory.FactoryDeBase.ProduitFactory.ProduitFactory1;
import Design_Patterns.Factory.FactoryDeBase.ProduitFactory.ProduitFactory2;

public class Client {
    public static void main(String[] args){
        ProduitFactory produitFactory1=new ProduitFactory1();
        ProduitFactory produitFactory2=new ProduitFactory2();
        
        
        ProduitA produitA=null;

        System.out.println("\nFACTORY DE BASE\n");

        System.out.println("\n*****************************");
        
        System.out.println("\nUtilisation de la premiere fabrique");
        produitA=produitFactory1.getProduitA();
        produitA.methodeA();

        System.out.println("\n*****************************");

        System.out.println("\nUtilisation de la seconde fabrique");
        produitA=produitFactory2.getProduitA();
        produitA.methodeA();

        System.out.println("\n*****************************\n");

        
       
    
    }   
}


