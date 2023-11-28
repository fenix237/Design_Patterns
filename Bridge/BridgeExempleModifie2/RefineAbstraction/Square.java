package Design_Patterns.Bridge.BridgeExempleModifie2.RefineAbstraction;

import Design_Patterns.Bridge.BridgeExempleModifie2.Abstraction.Shape;
import Design_Patterns.Bridge.BridgeExempleModifie2.Implementor.Color;

public class Square extends Shape{
    
    public Square(Color color) {
        super(color);
    }

    public void colorIt() {
        System.out.print("Square filled with ");
        color.fillColor();
    }
}