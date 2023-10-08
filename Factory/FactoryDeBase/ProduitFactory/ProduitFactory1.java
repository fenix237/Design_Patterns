package Design_Patterns.Factory.FactoryDeBase.ProduitFactory;

import Design_Patterns.Factory.FactoryDeBase.Produit.ProduitA;
import Design_Patterns.Factory.FactoryDeBase.Produit.ProduitA1;

public class ProduitFactory1 extends ProduitFactory{
    protected ProduitA createProduitA(){
        return new ProduitA1();
    }
    
}
