package Design_Patterns.Builder.BuilderModifie.Monteur;

import Design_Patterns.Builder.BuilderModifie.Produit.Pizza;

public class MonteurPizzaReine extends MonteurPizza{

    public void monterPate(){
        pizza.setPate("croisee");
    }

    public void montersauce(){
        pizza.setSauce("douce");
    }

    public void montergarniture(){
        pizza.setGarniture("jambon+champignon");
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void creerNouvellePizza(){
        pizza=new Pizza();
    }

   
    
}
