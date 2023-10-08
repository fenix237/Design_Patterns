package Design_Patterns.Factory.FactoryDeBase.ProduitFactory;

import Design_Patterns.Factory.FactoryDeBase.Produit.ProduitA;
import Design_Patterns.Factory.FactoryDeBase.Produit.ProduitA2;

public class ProduitFactory2 extends ProduitFactory{
    protected ProduitA createProduitA(){
        return new ProduitA2();
    }
    
}
