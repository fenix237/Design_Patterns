package Design_Patterns.Bridge.BridgeExempleModifie;

import Design_Patterns.Bridge.BridgeExempleModifie.Abstraction.Shape;
import Design_Patterns.Bridge.BridgeExempleModifie.ConcreteImplementor.BlueColor;
import Design_Patterns.Bridge.BridgeExempleModifie.ConcreteImplementor.RedColor;
import Design_Patterns.Bridge.BridgeExempleModifie.RefineAbstraction.Circle;
import Design_Patterns.Bridge.BridgeExempleModifie.RefineAbstraction.Rectangle;
import Design_Patterns.Bridge.BridgeExempleModifie.RefineAbstraction.Square;

public class BridgeModifieDesignPatternMain {

    public static void main(String[] args) {

        System.out.println("\n\nPATRON BRIDGE EXEMPLE MODIFIE AVEC AUTRE FORME\n\n");

        Shape s1 = new Rectangle(new RedColor());
        s1.colorIt();

        System.out.println("\n*********************************\n");

        Shape s2 = new Circle(new BlueColor());
        s2.colorIt();

        System.out.println("\n*********************************\n");

        Shape s3 = new Square(new BlueColor());
        s3.colorIt();

        System.out.println("\n\n*****************************\n\n");
    }
    
}
