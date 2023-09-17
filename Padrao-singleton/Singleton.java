package client;

public class Singleton {

    private static Singleton instance = null;

    public static Singleton getSingleton() {
        if (instance == null) {
            System.out.println("Instancia criada com sucesso!");
            instance = new Singleton();
        } else {
            System.out.println("Instancia ja criada anteriormente!");
        }
        return instance;
    }
}
