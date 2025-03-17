package singleton;

import java.lang.reflect.Constructor;

public class ReflectionBreakSingleton {
    public static void main(String[]args) throws Exception {
        Singelton instance1 = Singelton.getInstance();

        Constructor<Singelton> constructor = Singelton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singelton instance2 = constructor.newInstance();

        System.out.println("Instance 1: " + instance1.hashCode());
        System.out.println("Instance 2: " + instance2.hashCode()); //Singelton Broken
    }
}
