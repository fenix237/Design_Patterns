package Design_Patterns.AbstractFactory.AbstractFactoryModifie.ProduitFactory;

import Design_Patterns.AbstractFactory.AbstractFactoryModifie.Produit.ProduitA;
import Design_Patterns.AbstractFactory.AbstractFactoryModifie.Produit.ProduitB;

public abstract interface FabriqueAbstraite {
    public abstract ProduitA createProduitA();
    public abstract ProduitB createProduitB();
     
}