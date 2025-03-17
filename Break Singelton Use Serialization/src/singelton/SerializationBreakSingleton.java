package singelton;

import java.io.*;

public class SerializationBreakSingleton {
    public static void main(String[] args) throws Exception {
        Singleton instance1 = Singleton.getInstance();


        //Serialization
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.txt"));
        oos.writeObject(instance1);
        oos.close();

        //Deserialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.txt"));
        Singleton instance2 = (Singleton) ois.readObject();
        ois.close();

        System.out.println("instance1 hashCode:- " + instance1.hashCode());
        System.out.println("instance2 hashCode:- " + instance2.hashCode());  //Singelton Broken
    }
}
