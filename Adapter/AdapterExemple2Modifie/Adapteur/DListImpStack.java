package Design_Patterns.Adapter.AdapterExemple2Modifie.Adapteur;

import Design_Patterns.Adapter.AdapterExemple2Modifie.Adapte.DList;
import Design_Patterns.Adapter.AdapterExemple2Modifie.Interface.Stack;
import Design_Patterns.Adapter.AdapterExemple2Modifie.Objet.Object;

public class DListImpStack extends DList implements Stack{

   
    public void push(Object o){
        insertTail(o);
    }

    public Object pop(){
        return removeTail();
    }

    public Object top(){
        return getTail();

    }

    
    
}
