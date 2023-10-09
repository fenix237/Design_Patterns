package Design_Patterns.AbstractFactory.AbstractFactoryDeBase;

import Design_Patterns.AbstractFactory.AbstractFactoryDeBase.Produit.ProduitA;
import Design_Patterns.AbstractFactory.AbstractFactoryDeBase.Produit.ProduitB;
import Design_Patterns.AbstractFactory.AbstractFactoryDeBase.ProduitFactory.FabriqueAbstraite;
import Design_Patterns.AbstractFactory.AbstractFactoryDeBase.ProduitFactory.FabriqueConcrete1;
import Design_Patterns.AbstractFactory.AbstractFactoryDeBase.ProduitFactory.FabriqueConcrete2;

public class Client {
    public static void main(String[] args){

        FabriqueAbstraite fabriqueConcrete1=new FabriqueConcrete1();
        FabriqueAbstraite fabriqueConcrete2=new FabriqueConcrete2();

        ProduitA produitA=null;
        ProduitB produitB=null;

        System.out.println("\nFABRIQUE ABSTRAITE DE BASE\n");

        System.out.println("\n*****************************");

        System.out.println("\nUtilisation de la 1ere fabrique concrete\n");
        produitA=fabriqueConcrete1.createProduitA();
        produitA.methodeA();

        produitB=fabriqueConcrete1.createProduitB();
        produitB.methodeB();

        System.out.println("\n*****************************");

        System.out.println("\nUtilisation de la 2eme fabrique concrete\n");
        produitA=fabriqueConcrete2.createProduitA();
        produitA.methodeA();

        produitB=fabriqueConcrete2.createProduitB();
        produitB.methodeB();

        System.out.println("\n*****************************\n");

    }
}
