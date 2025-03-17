package singelton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationPrevent {

    public static void main(String[] args) throws Exception{
        PreventSingleton instance1 = PreventSingleton.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.txt"));
        oos.writeObject(instance1);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.txt"));
        PreventSingleton instance2 = (PreventSingleton) ois.readObject();
        ois.close();


        System.out.println("instance1 hashCode:- " + instance1.hashCode());
        System.out.println("instance2 hashCode:- " + instance2.hashCode());
    }

}
