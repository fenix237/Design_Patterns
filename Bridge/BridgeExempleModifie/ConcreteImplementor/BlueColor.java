package Design_Patterns.Bridge.BridgeExempleModifie.ConcreteImplementor;

import Design_Patterns.Bridge.BridgeExempleModifie.Implementor.Color;

public class BlueColor implements Color {
    public void fillColor() {
        
        System.out.println("blue color");
    }
}