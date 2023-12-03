package Design_Patterns.Adapter.AdapterExemple3;

import Design_Patterns.Adapter.AdapterExemple3.Adapteur.AdaptRectangle;
import Design_Patterns.Adapter.AdapterExemple3.Interface.Icarre;

public class Client {
    public static void main(String[] args) {

        System.out.println("\nPATRON ADAPTER Cas de L'exemple 1\n\n");
        float perimetre;
        float aire;
        Icarre adaptRectangle = new AdaptRectangle();

        perimetre = adaptRectangle.perimetre(10, 5);
        System.out.println("Le perimetre est:" + perimetre);

        System.out.println("\n*********************\n");

        aire = adaptRectangle.aire(10, 5);
        System.out.println("L'aire est:" + aire);

        System.out.println("\n\n*********************\n\n");

    }
}
