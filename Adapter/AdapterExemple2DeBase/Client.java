package Design_Patterns.Adapter.AdapterExemple2DeBase;

import Design_Patterns.Adapter.AdapterExemple2DeBase.Adapteur.DListImpStack;
import Design_Patterns.Adapter.AdapterExemple2DeBase.Interface.Stack;
import Design_Patterns.Adapter.AdapterExemple2DeBase.Objets.Object;

public class Client {
    public static void main(String[] args){

        System.out.println("PATRON ADAPTER Cas de L'exemple 2");
        Object object1 = new Object();
        Stack stack = new DListImpStack();
        object1.print();
        stack.push(object1);
        stack.pop();
        stack.top();



    }
}
