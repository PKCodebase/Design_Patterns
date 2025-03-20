package prototype;

public class ProtoType {
    public static void main(String[] args) throws InterruptedException {

        NetworkConnection networkConnection =new NetworkConnection();
        networkConnection.setIp("192.168.1.1");

        networkConnection.loadVeryImportantData();
        System.out.println(networkConnection);


        //We want new Object

        try {
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
            NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();

            System.out.println(networkConnection2);
            System.out.println(networkConnection3);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
