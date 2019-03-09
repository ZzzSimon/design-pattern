package singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SingletonRegister {
    /** * 登记式单例模式, 保证map中的对象是同一份 */
    private static Map<String, Object> map;

    static {
        map = new ConcurrentHashMap<>();
        map.put(SingletonRegister.class.getName(), new SingletonRegister());
    }

    private SingletonRegister() {
        System.out.println("this Constructor is called");
    }

    public static Object getInstance(String name) {
        if (name == null) {
            name = SingletonRegister.class.getName();
        }
        if (map.get(name) == null) {
            try {
                map.put(name, Class.forName(name).getDeclaredConstructor().newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return map.get(name);
    }
}
