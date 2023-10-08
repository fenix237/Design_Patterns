package Design_Patterns.Factory.FactoryDeBase.ProduitFactory;

import Design_Patterns.Factory.FactoryDeBase.Produit.ProduitA;

public abstract class ProduitFactory {
    public ProduitA getProduitA(){
        return createProduitA();
    }
    protected abstract ProduitA createProduitA();
}
