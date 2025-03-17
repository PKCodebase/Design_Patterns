package singleton;

public class PreventSingelton {
    private static final PreventSingelton INSTANCE = new PreventSingelton();

    private PreventSingelton() {
        if (INSTANCE != null) { // Prevent Reflection
            throw new RuntimeException("Use getInstance() method!");
        }
    }
    public static PreventSingelton getInstance() {
        return INSTANCE;
    }
    public static void main(String[] args) {
        PreventSingelton instance1 = PreventSingelton.getInstance();
        PreventSingelton instance2 = PreventSingelton.getInstance();

        System.out.println("Instance 1: " + instance1.hashCode());
        System.out.println("Instance 2: " + instance2.hashCode());
    }


}
