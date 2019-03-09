package factory.factory;

import factory.entity.color.Color;
import factory.entity.shape.Shape;
import factory.enums.ColorEnum;
import factory.enums.ShapeEnum;

public class BlueCircleFactory extends AbstractArtFactory {
    @Override
    public Color getColor() {
        return ColorEnum.BLUE.getColor();
    }

    @Override
    public Shape getShape() {
        return ShapeEnum.CIRCLE.getShape();
    }

}
