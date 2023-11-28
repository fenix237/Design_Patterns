package Design_Patterns.Bridge.BridgeExemple.RefineAbstraction;

import Design_Patterns.Bridge.BridgeExemple.Abstraction.Shape;
import Design_Patterns.Bridge.BridgeExemple.Implementor.Color;

public class Circle extends Shape{
    
    public Circle(Color color) {
        super(color);
    }

    public void colorIt() {
        System.out.print("Circle filled with ");
        color.fillColor();
    }
}
