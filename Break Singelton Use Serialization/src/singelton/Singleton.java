package singelton;

import java.io.Serializable;

public class Singleton implements Serializable {
    public static Singleton instance = new Singleton();

    private Singleton() {

    }
    public static Singleton getInstance() {
        return instance;
    }
}
