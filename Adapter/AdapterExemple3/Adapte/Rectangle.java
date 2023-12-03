package Design_Patterns.Adapter.AdapterExemple3.Adapte;

public class Rectangle {

    private float longueur;
    private float largeur;

    public float perimetre(float longueur, float largeur){
        return (longueur+largeur)*2;
    }

    public float aire(float longueur, float largeur){
        return (longueur*largeur);
    }
}
