package Design_Patterns.Bridge.BridgeExemple.ConcreteImplementor;

import Design_Patterns.Bridge.BridgeExemple.Implementor.Color;

public class BlueColor implements Color {
    public void fillColor() {
        
        System.out.println("blue color");
    }
}