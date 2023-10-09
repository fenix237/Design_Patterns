package Design_Patterns.AbstractFactory.AbstractFactoryModifie.ProduitFactory;

import Design_Patterns.AbstractFactory.AbstractFactoryModifie.Produit.ProduitA;
import Design_Patterns.AbstractFactory.AbstractFactoryModifie.Produit.ProduitA3;
import Design_Patterns.AbstractFactory.AbstractFactoryModifie.Produit.ProduitB;
import Design_Patterns.AbstractFactory.AbstractFactoryModifie.Produit.ProduitB3;

public class FabriqueConcrete3 implements FabriqueAbstraite{

    public ProduitA createProduitA(){
        return new ProduitA3();
            
   
    }

    public ProduitB createProduitB(){
        return new ProduitB3();
            
   
    }
    
}
