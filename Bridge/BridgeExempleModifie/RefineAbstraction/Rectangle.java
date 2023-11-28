package Design_Patterns.Bridge.BridgeExempleModifie.RefineAbstraction;

import Design_Patterns.Bridge.BridgeExempleModifie.Abstraction.Shape;
import Design_Patterns.Bridge.BridgeExempleModifie.Implementor.Color;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    public void colorIt() {
        System.out.print("Rectangle filled with ");
        color.fillColor();
    }
}
