package proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        UserDao myObject = (UserDao) ProxyManager.getProxy(UserDao.class);
        myObject.sayHi("haha");
    }
}
