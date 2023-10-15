package Design_Patterns.Builder.BuilderModifie.Monteur;

import Design_Patterns.Builder.BuilderModifie.Produit.Pizza;

public abstract class MonteurPizza {

    protected Pizza pizza;

   
    public abstract Pizza getPizza();

    public abstract void creerNouvellePizza();


    
    public abstract void monterPate();
    public abstract void montersauce();
    public abstract void montergarniture();
    
    

}
