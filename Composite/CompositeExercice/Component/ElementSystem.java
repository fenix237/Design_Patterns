package Design_Patterns.Composite.CompositeExercice.Component;

public interface ElementSystem {

   public void decrire();
   public void ajouter(ElementSystem element);
   public void supprimer(ElementSystem element);
   public ElementSystem obtenir(int i);
    
}
