package Design_Patterns.AbstractFactory.AbstractFactoryDeBase.ProduitFactory;

import Design_Patterns.AbstractFactory.AbstractFactoryDeBase.Produit.ProduitA;
import Design_Patterns.AbstractFactory.AbstractFactoryDeBase.Produit.ProduitA2;
import Design_Patterns.AbstractFactory.AbstractFactoryDeBase.Produit.ProduitB2;

public class FabriqueConcrete2 implements FabriqueAbstraite{
    public ProduitA createProduitA(){
        return new ProduitA2();
            
   
    }

    public ProduitB2 createProduitB(){
        return new ProduitB2();
            
   
    }
}
