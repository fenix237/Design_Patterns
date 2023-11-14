package Design_Patterns.Composite.CompositeExercice.Composite;

import java.util.ArrayList;
import java.util.List;

import Design_Patterns.Composite.CompositeExercice.Component.ElementSystem;

public class Dossier implements ElementSystem{

    private String nom;
    private String type="Dossier";
    private List<ElementSystem> elements= new ArrayList<>();

   
    public void decrire() {
        System.out.println("\n le nom est :"+this.nom);
        System.out.println("le type d'element est: "+type);
        for(ElementSystem e : elements){
            e.decrire();
        }
    }

    public void ajouter(ElementSystem element) {
        elements.add(element);
    }

    public void supprimer(ElementSystem element) {
       elements.remove(element);
    }

    public ElementSystem obtenir(int i) {
        if (i < elements.size()) {
            return elements.get(i);
        }
        return null;
    }

    


   
}
