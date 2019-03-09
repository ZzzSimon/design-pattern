package singleton;

import java.lang.reflect.Constructor;

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        singletonEnum.whateverMethod();

        SingletonDCL singletonDCL = SingletonDCL.getSingleton();

        SingletonHungry singletonHungry = SingletonHungry.getInstance();

        SingletonInnerClass singletonInnerClass = SingletonInnerClass.getInstance();

        try {
            Constructor<SingletonHungry> constructor = SingletonHungry.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            SingletonHungry singletonHungry2 = constructor.newInstance();
            //非enum类型的单例模式，是不安全的，因为仍旧可以通过反射创建
            System.out.println(singletonHungry.equals(singletonHungry2));
        }catch (Exception e){
            e.printStackTrace();
        }
        //此行会报错，因为enum没法通过反射调用构造方法
        SingletonEnum singletonEnum2 = (SingletonEnum)SingletonRegister.getInstance(SingletonEnum.class.getName());
    }
}
