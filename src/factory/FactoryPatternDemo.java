package factory;

import factory.entity.shape.Shape;
import factory.enums.FactoryProducer;
import factory.enums.ShapeEnum;
import factory.factory.AbstractArtFactory;

public class FactoryPatternDemo {
    public static void main(String[] args) {

        //-----------------工厂模式---------------------------
        System.out.println("------------------工厂模式-----------------");
        Shape rect = ShapeEnum.RECTANGLE.getShape();
        rect.draw();

        Shape square = ShapeEnum.getShape("SQUARE");
        square.draw();

        //------------------抽象工厂模式-----------------------
        System.out.println("------------------抽象工厂模式-----------------");
        AbstractArtFactory blueCircleFactory = FactoryProducer.BLUE_CIRCLE_FACTORY.getFactory();
        blueCircleFactory.paint();

        AbstractArtFactory redSquareFactory = FactoryProducer.RED_SQUARE_FACTORY.getFactory();
        redSquareFactory.paint();

    }
}
