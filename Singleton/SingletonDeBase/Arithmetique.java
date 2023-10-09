package Design_Patterns.Singleton.SingletonDeBase;

public final class Arithmetique {

    private static Arithmetique instance=null;

    private int x;
    private int y;
    
    public Arithmetique() {
        super();
    }

    public Arithmetique(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    public static Arithmetique getInstance(){
        if(instance==null){
            instance=new Arithmetique();
        }

        return instance;
    }

    public static  Arithmetique getInstance(int x, int y){
        if (instance ==null){
            instance=new Arithmetique(x, y);
        }

        return instance;
    }

    public int somme(int x, int y){
        return x+y;
    }

    public float moyenne(int x, int y){
        return somme(x, y)/2;
    }

    public void affiche(){
        System.out.println("\n Je suis une instance , mes valeurs sont : x = "+ this.x +" et y = "+this.y);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
    

}
