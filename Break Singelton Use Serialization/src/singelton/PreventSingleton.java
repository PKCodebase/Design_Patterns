package singelton;

import java.io.Serializable;

public class PreventSingleton implements Serializable {
    private static PreventSingleton instance = new PreventSingleton();

    private PreventSingleton() {
    }

    public static PreventSingleton getInstance() {
        return instance;
    }
    public Object readResolve() {
        return instance;
    }
}
