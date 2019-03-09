package proxy.handler;

import proxy.anno.ImplPathAnnotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class MethodNameHandler implements InvocationHandler {



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        ImplPathAnnotation implPathAnnotation = method.getDeclaringClass().getAnnotation(ImplPathAnnotation.class);
        String path = implPathAnnotation.path();
        Class<?> clazz = Class.forName(path);
        Object res = method.invoke(clazz.getDeclaredConstructor().newInstance(),args);
        System.out.println("代理内识别方法名："+method.getName());
        return res;
    }
}
