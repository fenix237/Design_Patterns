package Design_Patterns.Bridge.BridgeExemple;

import Design_Patterns.Bridge.BridgeExemple.Abstraction.Shape;
import Design_Patterns.Bridge.BridgeExemple.ConcreteImplementor.BlueColor;
import Design_Patterns.Bridge.BridgeExemple.ConcreteImplementor.RedColor;
import Design_Patterns.Bridge.BridgeExemple.RefineAbstraction.Circle;
import Design_Patterns.Bridge.BridgeExemple.RefineAbstraction.Rectangle;

public class BridgeDesignPatternMain {
    public static void main(String[] args) {
        
        Shape s1 = new Rectangle(new RedColor());
        s1.colorIt();
        Shape s2 = new Circle(new BlueColor());
        s2.colorIt();
    }
}