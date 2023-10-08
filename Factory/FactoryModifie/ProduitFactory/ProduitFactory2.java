package Design_Patterns.Factory.FactoryModifie.ProduitFactory;

import Design_Patterns.Factory.FactoryModifie.Produit.ProduitA;
import Design_Patterns.Factory.FactoryModifie.Produit.ProduitA2;

public class ProduitFactory2 extends ProduitFactory{
    protected ProduitA createProduitA(){
        return new ProduitA2();
    }
    
}
