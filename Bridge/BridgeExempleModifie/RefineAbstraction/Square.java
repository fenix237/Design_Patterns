package Design_Patterns.Bridge.BridgeExempleModifie.RefineAbstraction;

import Design_Patterns.Bridge.BridgeExempleModifie.Abstraction.Shape;
import Design_Patterns.Bridge.BridgeExempleModifie.Implementor.Color;

public class Square extends Shape{
    
    public Square(Color color) {
        super(color);
    }

    public void colorIt() {
        System.out.print("Square filled with ");
        color.fillColor();
    }
}
