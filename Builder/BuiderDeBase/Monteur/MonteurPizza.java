package Design_Patterns.Builder.BuiderDeBase.Monteur;

import Design_Patterns.Builder.BuiderDeBase.Produit.Pizza;

public abstract class MonteurPizza {

    protected Pizza pizza;

   
    public Pizza getPizza() {
        return pizza;
    }

    public void creerNouvellePizza(){
        pizza=new Pizza();
    }

    
    public abstract void monterPate();
    public abstract void montersauce();
    public abstract void montergarniture();

    


}
