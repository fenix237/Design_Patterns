package Design_Patterns.Bridge.BridgeExempleModifie2.ConcreteImplementor;

import Design_Patterns.Bridge.BridgeExempleModifie2.Implementor.Color;

public class GreenColor implements Color {
    
    public void fillColor() {
        
        System.out.println("Green color");
    }
}