package Design_Patterns.Bridge.BridgeExempleModifie2;

import Design_Patterns.Bridge.BridgeExempleModifie2.Abstraction.Shape;
import Design_Patterns.Bridge.BridgeExempleModifie2.ConcreteImplementor.BlueColor;
import Design_Patterns.Bridge.BridgeExempleModifie2.ConcreteImplementor.GreenColor;
import Design_Patterns.Bridge.BridgeExempleModifie2.ConcreteImplementor.RedColor;
import Design_Patterns.Bridge.BridgeExempleModifie2.RefineAbstraction.Circle;
import Design_Patterns.Bridge.BridgeExempleModifie2.RefineAbstraction.Rectangle;
import Design_Patterns.Bridge.BridgeExempleModifie2.RefineAbstraction.Square;

public class BridgeModifieDesignPattern2 {
    
    public static void main(String[] args) {

        System.out.println("\n\nPATRON BRIDGE EXEMPLE MODIFIE AVEC AUTRE FORME\n\n");

        Shape s1 = new Rectangle(new RedColor());
        s1.colorIt();

        System.out.println("\n*********************************\n");

        Shape s2 = new Circle(new BlueColor());
        s2.colorIt();

        System.out.println("\n*********************************\n");

        Shape s3 = new Square(new GreenColor());
        s3.colorIt();

        System.out.println("\n\n*****************************\n\n");
        
    }
}
