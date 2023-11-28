package Design_Patterns.Bridge.BridgeExemple.Abstraction;

import Design_Patterns.Bridge.BridgeExemple.Implementor.Color;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void colorIt();
    
}
