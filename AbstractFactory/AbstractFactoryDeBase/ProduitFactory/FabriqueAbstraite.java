package Design_Patterns.AbstractFactory.AbstractFactoryDeBase.ProduitFactory;

import Design_Patterns.AbstractFactory.AbstractFactoryDeBase.Produit.ProduitA;
import Design_Patterns.AbstractFactory.AbstractFactoryDeBase.Produit.ProduitB;

public abstract interface FabriqueAbstraite {
    public abstract ProduitA createProduitA();
    public abstract ProduitB createProduitB();
     
}
