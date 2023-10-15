package Design_Patterns.Builder.BuiderDeBase.Monteur;

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

   
    
}
