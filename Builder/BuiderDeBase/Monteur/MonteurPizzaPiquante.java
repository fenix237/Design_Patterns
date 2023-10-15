package Design_Patterns.Builder.BuiderDeBase.Monteur;

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

   
}

