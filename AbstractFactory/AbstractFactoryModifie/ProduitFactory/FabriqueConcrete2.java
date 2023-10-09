package Design_Patterns.AbstractFactory.AbstractFactoryModifie.ProduitFactory;

import Design_Patterns.AbstractFactory.AbstractFactoryModifie.Produit.ProduitA;
import Design_Patterns.AbstractFactory.AbstractFactoryModifie.Produit.ProduitA2;
import Design_Patterns.AbstractFactory.AbstractFactoryModifie.Produit.ProduitB;
import Design_Patterns.AbstractFactory.AbstractFactoryModifie.Produit.ProduitB2;
import Design_Patterns.AbstractFactory.AbstractFactoryModifie.Produit.ProduitC;
import Design_Patterns.AbstractFactory.AbstractFactoryModifie.Produit.ProduitC2;

public class FabriqueConcrete2 implements FabriqueAbstraite{
    public ProduitA createProduitA(){
        return new ProduitA2();
            
   
    }

    public ProduitB createProduitB(){
        return new ProduitB2();
            
   
    }

    public ProduitC createProduitC(){
        return new ProduitC2();
            
   
    }
}
