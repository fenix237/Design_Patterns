package Design_Patterns.Bridge.BridgeExempleModifie2.RefineAbstraction;

import Design_Patterns.Bridge.BridgeExempleModifie2.Abstraction.Shape;
import Design_Patterns.Bridge.BridgeExempleModifie2.Implementor.Color;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    public void colorIt() {
        System.out.print("Rectangle filled with ");
        color.fillColor();
    }
}
