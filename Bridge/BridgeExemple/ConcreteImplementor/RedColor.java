package Design_Patterns.Bridge.BridgeExemple.ConcreteImplementor;

import Design_Patterns.Bridge.BridgeExemple.Implementor.Color;

public class RedColor implements Color {
    public void fillColor() {
        System.out.println("red color");
    }
}