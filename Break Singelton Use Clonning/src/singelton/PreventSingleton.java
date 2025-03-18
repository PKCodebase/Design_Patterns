package singelton;

public class PreventSingleton {
    public static void main(String[] args) throws CloneNotSupportedException {
        try {
            Singleton2 instance1 = Singleton2.getInstance();
            Singleton2 instance2 = (Singleton2) instance1.clone();

            System.out.println(instance1.hashCode());
            System.out.println(instance2.hashCode());
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning is not allowed for Singleton objects!");
        }

    }
}
