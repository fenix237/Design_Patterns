package Design_Patterns.Builder.BuilderModifie.Monteur;

import Design_Patterns.Builder.BuilderModifie.Produit.Pizza;

public class MonteurPizzaPiquante extends MonteurPizza{

    public void monterPate(){
        pizza.setPate("feuilletee");
    }

    public void montersauce(){
        pizza.setSauce("piquante");
    }

    public void montergarniture(){
        pizza.setGarniture("pepperoni+salami");
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void creerNouvellePizza(){
        pizza=new Pizza();
    }

   
}
