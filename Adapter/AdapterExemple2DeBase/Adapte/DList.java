package Design_Patterns.Adapter.AdapterExemple2DeBase.Adapte;

import Design_Patterns.Adapter.AdapterExemple2DeBase.Objets.Dnode;
import Design_Patterns.Adapter.AdapterExemple2DeBase.Objets.Object;

public class DList {

    public void insert(Dnode pos , Object o ){
        System.out.println("Inserer dnode et l'objet");

    }

    public void remove(Dnode pos){
        System.out.println("Retirer Dnode");
    }
    
    public void insertHead(Object o ){
        System.out.println("Inserer tete");
    }

    public void insertTail(Object o){
        System.out.println("Inserer queue");
    }

    public Object removeHead(){
        System.out.println("Sortie de tete");
        return new Object();
    }

    public Object removeTail(){
        System.out.println("Sortie de queue");
        return new Object();
    }

    public Object getHead(){
        System.out.println("Afficher tete");
        return new Object();
    }
    public Object getTail(){
        System.out.println("Afficher queue");
        return new Object();
    }
}
