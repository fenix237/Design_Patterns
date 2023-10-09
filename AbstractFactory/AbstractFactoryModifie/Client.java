package Design_Patterns.AbstractFactory.AbstractFactoryModifie;

import Design_Patterns.AbstractFactory.AbstractFactoryModifie.Produit.ProduitA;
import Design_Patterns.AbstractFactory.AbstractFactoryModifie.Produit.ProduitB;
import Design_Patterns.AbstractFactory.AbstractFactoryModifie.Produit.ProduitC;
import Design_Patterns.AbstractFactory.AbstractFactoryModifie.ProduitFactory.FabriqueAbstraite;
import Design_Patterns.AbstractFactory.AbstractFactoryModifie.ProduitFactory.FabriqueConcrete1;
import Design_Patterns.AbstractFactory.AbstractFactoryModifie.ProduitFactory.FabriqueConcrete2;


public class Client {
    public static void main(String[] args){

        FabriqueAbstraite fabriqueConcrete1=new FabriqueConcrete1();
        FabriqueAbstraite fabriqueConcrete2=new FabriqueConcrete2();
       

        ProduitA produitA=null;
        ProduitB produitB=null;
        ProduitC produitC=null;

        System.out.println("\nFABRIQUE ABSTRAITE MODIFIE\n");


        System.out.println("\n*****************************");

        System.out.println("\nUtilisation de la 1ere fabrique concrete\n");
        produitA=fabriqueConcrete1.createProduitA();
        produitA.methodeA();

        produitB=fabriqueConcrete1.createProduitB();
        produitB.methodeB();

        produitC=fabriqueConcrete1.createProduitC();
        produitC.methodeC();

        System.out.println("\n*****************************");

        System.out.println("\nUtilisation de la 2eme fabrique concrete\n");
        produitA=fabriqueConcrete2.createProduitA();
        produitA.methodeA();

        produitB=fabriqueConcrete2.createProduitB();
        produitB.methodeB();

        produitC=fabriqueConcrete2.createProduitC();
        produitC.methodeC();

        System.out.println("\n*****************************\n");

    }
}
