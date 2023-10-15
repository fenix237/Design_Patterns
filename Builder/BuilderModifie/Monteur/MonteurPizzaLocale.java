package Design_Patterns.Builder.BuilderModifie.Monteur;

import Design_Patterns.Builder.BuilderModifie.Produit.Pizza;

public class MonteurPizzaLocale extends MonteurPizza{

    public void monterPate(){
        pizza.setPate("feuilles de macabo");
    }

    public void montersauce(){
        pizza.setSauce("sauce jaune");
    }

    public void montergarniture(){
        pizza.setGarniture("escargot");
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void creerNouvellePizza(){
        pizza=new Pizza();
    }

   
    
}

