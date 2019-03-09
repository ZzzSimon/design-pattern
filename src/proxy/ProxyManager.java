package proxy;

import proxy.handler.MethodNameHandler;
import java.lang.reflect.Proxy;

public class ProxyManager {



    public static Object getProxy(Class<?> clazz){

        Class<?>[] classes ;
        if (clazz.isInterface()){
            classes = new Class<?>[] {clazz};
        }else {
            classes= clazz.getInterfaces();
        }

        return Proxy.newProxyInstance(clazz.getClassLoader(),classes , new MethodNameHandler());
    }
}
