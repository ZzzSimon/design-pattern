package proxy;

import proxy.anno.ImplPathAnnotation;

@ImplPathAnnotation(path = "proxy.MyObject")
public interface UserDao {

    void sayHi(String text);
}
