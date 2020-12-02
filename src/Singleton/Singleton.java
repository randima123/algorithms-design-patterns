package Singleton;

public class Singleton {

    private int RegistryCount;

    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getSingletonInstance() {

        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
