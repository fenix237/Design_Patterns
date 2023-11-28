package Design_Patterns.Bridge.BridgeExempleModifie.ConcreteImplementor;

import Design_Patterns.Bridge.BridgeExempleModifie.Implementor.Color;

public class RedColor implements Color {
    
    public void fillColor() {
        
        System.out.println("red color");
    }
}