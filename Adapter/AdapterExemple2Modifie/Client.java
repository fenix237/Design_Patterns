package Design_Patterns.Adapter.AdapterExemple2Modifie;

import Design_Patterns.Adapter.AdapterExemple2Modifie.Adapteur.DListImpStack;
import Design_Patterns.Adapter.AdapterExemple2Modifie.Interface.Stack;
import Design_Patterns.Adapter.AdapterExemple2Modifie.Objet.Object;

public class Client {
    public static void main(String[] args){

        System.out.println("PATRON  ADAPTER Cas de L'exemple 2 modifie");
        Object object1 = new Object();
        Stack stack = new DListImpStack();
        object1.print();
        stack.push(object1);
        stack.pop();
        stack.top();



    }
}
