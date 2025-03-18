package singelton;

public class Singleton2 implements Cloneable {
    public static Singleton2 instance = new Singleton2();

    private Singleton2() {

    }
    public static Singleton2 getInstance() {
        return instance;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
