package Design_Patterns.Builder.BuiderDeBase.Directeur;

import Design_Patterns.Builder.BuiderDeBase.Monteur.MonteurPizza;
import Design_Patterns.Builder.BuiderDeBase.Produit.Pizza;

public class Directeur {

    private MonteurPizza monteurPizza;

    public void setMonteurPizza(MonteurPizza monPizz){
        monteurPizza=monPizz;
    }

    public Pizza getPizza(){
        return monteurPizza.getPizza();
    }

    
    
    public void contruire(){

       monteurPizza.creerNouvellePizza();
       monteurPizza.monterPate();
       monteurPizza.montersauce();
       monteurPizza.montergarniture();
        
    }
}
