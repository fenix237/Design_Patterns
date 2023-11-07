package Design_Patterns.Adapter.AdapterExemple2Modifie;

import Design_Patterns.Adapter.AdapterExemple2Modifie.Adapteur.DListImpStack;
import Design_Patterns.Adapter.AdapterExemple2Modifie.Interface.Stack;
import Design_Patterns.Adapter.AdapterExemple2Modifie.Objet.Object;

public class Client {
    public static void main(String[] args){

        System.out.println("\nPATRON ADAPTER Cas de L'exemple 2 modifie\n\n");
        Object object1 = new Object();
        Stack stack = new DListImpStack();
        object1.print();
        System.out.println("\n");
        stack.push(object1);
        stack.pop();
        stack.top();

        System.out.println("\n\n");



    }
}
