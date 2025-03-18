package singelton;

public class Singleton implements Cloneable  {
    public static Singleton instance = new Singleton();

    private Singleton() {

    }
    public static Singleton getInstance() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
