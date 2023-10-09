package Design_Patterns.AbstractFactory.AbstractFactoryModifie.ProduitFactory;

import Design_Patterns.AbstractFactory.AbstractFactoryModifie.Produit.ProduitA;
import Design_Patterns.AbstractFactory.AbstractFactoryModifie.Produit.ProduitA1;
import Design_Patterns.AbstractFactory.AbstractFactoryModifie.Produit.ProduitB;
import Design_Patterns.AbstractFactory.AbstractFactoryModifie.Produit.ProduitB1;

public class FabriqueConcrete1 implements FabriqueAbstraite{

    public ProduitA createProduitA(){
        return new ProduitA1();
            
   
    }

    public ProduitB createProduitB(){
        return new ProduitB1();
            
   
    }
    
}


