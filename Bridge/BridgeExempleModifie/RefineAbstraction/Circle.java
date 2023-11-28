package Design_Patterns.Bridge.BridgeExempleModifie.RefineAbstraction;

import Design_Patterns.Bridge.BridgeExempleModifie.Abstraction.Shape;
import Design_Patterns.Bridge.BridgeExempleModifie.Implementor.Color;

public class Circle extends Shape{
    
    public Circle(Color color) {
        super(color);
    }

    public void colorIt() {
        System.out.print("Circle filled with ");
        color.fillColor();
    }
}