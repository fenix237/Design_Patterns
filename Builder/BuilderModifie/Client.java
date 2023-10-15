package Design_Patterns.Builder.BuilderModifie;

import Design_Patterns.Builder.BuilderModifie.Directeur.Directeur;
import Design_Patterns.Builder.BuilderModifie.Monteur.MonteurPizza;
import Design_Patterns.Builder.BuilderModifie.Monteur.MonteurPizzaLocale;
import Design_Patterns.Builder.BuilderModifie.Monteur.MonteurPizzaPiquante;
import Design_Patterns.Builder.BuilderModifie.Monteur.MonteurPizzaReine;
import Design_Patterns.Builder.BuilderModifie.Produit.Pizza;

public class Client {

    public static void main(String[] args){

    
        MonteurPizza pizzaPiquante = new MonteurPizzaPiquante();
        MonteurPizza pizzaReine = new MonteurPizzaReine();
        MonteurPizza pizzaLocale=new MonteurPizzaLocale();
        Directeur directeur = new Directeur();
        Pizza pizza=null;

        System.out.println("\nBUILDER MODIFIE\n");

        System.out.println("**********************\n");

        System.out.println("Pizza piquante\n");

        directeur.setMonteurPizza(pizzaPiquante);
        directeur.contruire();
        pizza = directeur.getPizza();
        pizza.print();

        System.out.println("\n**********************");

        System.out.println("\nPizza reine\n");

        directeur.setMonteurPizza(pizzaReine);
        directeur.contruire();
        pizza=directeur.getPizza();
        pizza.print();

        System.out.println("\n**********************");

        System.out.println("\nPizza locale\n");

        directeur.setMonteurPizza(pizzaLocale);
        directeur.contruire();
        pizza=directeur.getPizza();
        pizza.print();

        System.out.println("\n**********************\n");
    
    

    }
    
}