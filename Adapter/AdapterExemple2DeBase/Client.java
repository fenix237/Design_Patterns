package Design_Patterns.Adapter.AdapterExemple2DeBase;

import Design_Patterns.Adapter.AdapterExemple2DeBase.Adapteur.DListImpStack;
import Design_Patterns.Adapter.AdapterExemple2DeBase.Objets.Object;

public class Client {
    public static void main(String[] args){

        System.out.println("PATRON ADAPTER Cas de L'exemple 2");
        Object object1 = new Object();
        DListImpStack dListImpStack = new DListImpStack();
        object1.print();
        dListImpStack.push(object1);
        dListImpStack.pop();
        dListImpStack.top();



    }
}
