package Design_Patterns.Composite.CompositeExemple.Composite;



import Design_Patterns.Composite.CompositeExemple.Component.Texte;

public class Section extends Texte{



    public void longueur(){
        System.out.println("\nAffichage de la longueur du  texte\n");
    }
    public void ajout(Texte texte){
       
        System.out.println("\najout du texte " +texte);

    }
    public void retrait(int index){
        System.out.println("\nRetrait du texte "+index);
    }
    
}
