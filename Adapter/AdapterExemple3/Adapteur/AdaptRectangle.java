package Design_Patterns.Adapter.AdapterExemple3.Adapteur;

import Design_Patterns.Adapter.AdapterExemple3.Adapte.Rectangle;
import Design_Patterns.Adapter.AdapterExemple3.Interface.Icarre;

public class AdaptRectangle implements Icarre{

    Rectangle rectangle =new Rectangle();
    public float perimetre(float longueur, float largeur){
       
        return rectangle.perimetre(longueur,largeur);
    }

    public float aire(float longueur,float largeur){
       
        return rectangle.aire(longueur,largeur);
    }
    
}
