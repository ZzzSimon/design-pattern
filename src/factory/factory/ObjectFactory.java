package factory.factory;

public class ObjectFactory {
    public static  <T> T getObject(Class<? extends T> clazz) {
        if (clazz == null ) {
            return null;
        }
        T obj  = null;
        try {
            obj = clazz.getDeclaredConstructor().newInstance();
        } catch (ReflectiveOperationException  e) {
            e.printStackTrace();
        }
        return obj;
    }
}
