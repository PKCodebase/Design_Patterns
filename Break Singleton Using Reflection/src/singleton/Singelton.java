package singleton;

public class Singelton {

    public static final Singelton instance = new Singelton();

    private Singelton(){

    }
    public static Singelton getInstance(){
        return instance;
    }
}


