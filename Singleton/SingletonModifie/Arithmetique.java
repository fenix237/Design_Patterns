package Design_Patterns.Singleton.SingletonModifie;

public final class Arithmetique {

    private static Arithmetique instance=null;

    private int x;
    private int y;
    private int z;

  
    private Arithmetique() {
        super();
    }

    private Arithmetique(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private Arithmetique(int x, int y,int z) {
        this.x = x;
        this.y = y;
        this.z=z;
    }

    
    public static Arithmetique getInstance(){
        if(instance==null){
            System.out.print("\nCreation d'une nouvelle instance\n");
            instance=new Arithmetique();
            System.out.print("\nInstance cree\n");
        }

        return instance;
    }

    public static  Arithmetique getInstance(int x, int y){
        if (instance ==null){
            System.out.print("\nCreation d'une nouvelle instance\n");
            instance=new Arithmetique(x,y);
            System.out.print("\nInstance cree\n");
        }

        return instance;
    }

    public static  Arithmetique getInstance(int x, int y,int z){
        if (instance ==null){
            System.out.print("\nCreation d'une nouvelle instance\n");
            instance=new Arithmetique(x,y,z);
            System.out.print("\nInstance cree\n");
        }

        return instance;
    }

    public int somme(int x, int y, int z){
        return x+y+z;
    }

     public int Multiplication(int x, int y,  int z){
        return x*y*z;
    }

     public int soustraction(int x, int y, int z){
        return x-y-z;
    }

     public float division(int x, int y, int z){
        return (float)((float)x/y)/z;
    }

     public float moyenne(int x, int y, int z){
        return (float)somme(x, y,z)/3;
    }

    public void affiche(){
        System.out.println("\n Je suis une instance , mes valeurs sont : x = "+ this.x +" , y = "+this.y+" z = "+this.z);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
    

}

