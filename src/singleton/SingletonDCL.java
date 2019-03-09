package singleton;

public class SingletonDCL {

    private volatile static SingletonDCL instance;

    private SingletonDCL(){}

    public static SingletonDCL getSingleton() {
        if (instance == null) {
            synchronized (SingletonDCL.class) {
                if (instance == null) {
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }
}
