package Design_Patterns.Bridge.BridgeExemple.RefineAbstraction;

import Design_Patterns.Bridge.BridgeExemple.Abstraction.Shape;
import Design_Patterns.Bridge.BridgeExemple.Implementor.Color;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    public void colorIt() {
        System.out.print("Rectangle filled with ");
        color.fillColor();
    }
}
