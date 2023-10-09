package Design_Patterns.Singleton.SingletonDeBase;

public class TestArithmetique {

    public static void main(String[] args){

        

        int som = Arithmetique.getInstance().somme(2, 5); 
             

        System.out.printf("\nSINGLETON DE BASE");

        System.out.println("\n*********************");

        System.out.printf("\nla somme est %d",som);
        
        
        System.out.printf("\n*********************\n");

        Arithmetique a1= Arithmetique.getInstance(8, 3);
        a1.affiche();

        Arithmetique a2=Arithmetique.getInstance(5, 9);
        a2.affiche();
    }
    
}

