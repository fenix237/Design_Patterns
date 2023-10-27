package Design_Patterns.Adapter.AdapterExemple2DeBase.Adapteur;

import Design_Patterns.Adapter.AdapterExemple2DeBase.Adapte.DList;
import Design_Patterns.Adapter.AdapterExemple2DeBase.Interface.Stack;
import Design_Patterns.Adapter.AdapterExemple2DeBase.Objets.Object;

public class DListImpStack extends DList implements Stack{

    DList dlist=new DList();
    public void push(Object o){
        dlist.insertTail(o);
    }

    public Object pop(){
        return dlist.removeTail();
    }

    public Object top(){
        return dlist.getTail();

    }
    
}
