package Design_Patterns.Bridge.BridgeExempleModifie2.Abstraction;

import Design_Patterns.Bridge.BridgeExempleModifie2.Implementor.Color;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }
    

    abstract public void colorIt();

}
