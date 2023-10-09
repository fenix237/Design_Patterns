package Design_Patterns.Singleton.SingletonModifie;

public class TestArithmetique {

    public static void main(String[] args){

        System.out.printf("\nSINGLETON MODIFIE\n");

        Arithmetique a3= Arithmetique.getInstance(8, 3,10);
        a3.affiche();

        int som = a3.somme(2,5,6);
        int sous=a3.soustraction(2,5,6);
        int mul=a3.Multiplication(2,5,6);
        float div=a3.division(2,5,6);
        float moy=a3.moyenne(2,5,6);

        

        System.out.printf("\n*********************");

        System.out.println("\nOperations Arithmetiques entre 2, 5 et 6: \n");

        System.out.println("la somme est "+som);
        System.out.println("la soustraction est "+sous);
        System.out.println("la multiplication est "+mul);
        System.out.println("la division est "+div);
        System.out.println("la moyenne est "+moy);

        System.out.printf("\n*********************");

        Arithmetique a1= Arithmetique.getInstance(8, 3);
        a1.affiche();

        Arithmetique a2=Arithmetique.getInstance(5, 9);
        a2.affiche();

        System.out.printf("\n*********************\n\n");
    }
    
}

