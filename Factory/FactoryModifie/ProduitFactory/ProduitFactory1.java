package Design_Patterns.Factory.FactoryModifie.ProduitFactory;

import Design_Patterns.Factory.FactoryModifie.Produit.ProduitA;
import Design_Patterns.Factory.FactoryModifie.Produit.ProduitA1;

public class ProduitFactory1 extends ProduitFactory{
    protected ProduitA createProduitA(){
        return new ProduitA1();
    }
    
}