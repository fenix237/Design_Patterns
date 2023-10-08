package Design_Patterns.Factory.FactoryModifie.ProduitFactory;

import Design_Patterns.Factory.FactoryModifie.Produit.ProduitA;

public abstract class ProduitFactory {
    public ProduitA getProduitA(){
        return createProduitA();
    }
    protected abstract ProduitA createProduitA();
}
