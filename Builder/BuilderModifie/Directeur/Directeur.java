package Design_Patterns.Builder.BuilderModifie.Directeur;

import Design_Patterns.Builder.BuilderModifie.Monteur.MonteurPizza;
import Design_Patterns.Builder.BuilderModifie.Produit.Pizza;

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

