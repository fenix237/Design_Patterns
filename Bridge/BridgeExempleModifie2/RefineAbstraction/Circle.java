package Design_Patterns.Bridge.BridgeExempleModifie2.RefineAbstraction;

import Design_Patterns.Bridge.BridgeExempleModifie2.Abstraction.Shape;
import Design_Patterns.Bridge.BridgeExempleModifie2.Implementor.Color;

public class Circle extends Shape{
    
    public Circle(Color color) {
        super(color);
    }

    public void colorIt() {
        System.out.print("Circle filled with ");
        color.fillColor();
    }
}
