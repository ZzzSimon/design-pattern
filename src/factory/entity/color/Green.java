package factory.entity.color;


public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Green::fill()");
    }
}
