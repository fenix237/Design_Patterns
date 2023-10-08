package Design_Patterns.Factory.FactoryModifie.ProduitFactory;

import Design_Patterns.Factory.FactoryModifie.Produit.ProduitA;
import Design_Patterns.Factory.FactoryModifie.Produit.ProduitA3;

public class ProduitFactory3 extends ProduitFactory{
    protected ProduitA createProduitA(){
        return new ProduitA3();
    }
    
}