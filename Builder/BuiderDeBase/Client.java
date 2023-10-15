package Design_Patterns.Builder.BuiderDeBase;

import Design_Patterns.Builder.BuiderDeBase.Directeur.Directeur;
import Design_Patterns.Builder.BuiderDeBase.Monteur.MonteurPizza;
import Design_Patterns.Builder.BuiderDeBase.Monteur.MonteurPizzaPiquante;
import Design_Patterns.Builder.BuiderDeBase.Monteur.MonteurPizzaReine;
import Design_Patterns.Builder.BuiderDeBase.Produit.Pizza;

public class Client {

    public static void main(String[] args) {

        MonteurPizza pizzaPiquante = new MonteurPizzaPiquante();
        MonteurPizza pizzaReine = new MonteurPizzaReine();
        Directeur directeur = new Directeur();
        Pizza pizza=null;

        System.out.println("\nBUILDER DE BASE\n");

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

        System.out.println("\n**********************\n");

    }

}

