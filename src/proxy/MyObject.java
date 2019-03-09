package proxy;


public class MyObject implements UserDao {

    @Override
    public void sayHi(String text) {
        System.out.println("hi ! "+text);
    }

    public void say(String name){
        System.out.println("hi"+name);
    }
}
