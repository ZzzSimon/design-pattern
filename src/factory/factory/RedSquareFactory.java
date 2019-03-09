package factory.factory;

import factory.entity.color.Color;
import factory.entity.shape.Shape;
import factory.enums.ColorEnum;
import factory.enums.ShapeEnum;

public class RedSquareFactory extends AbstractArtFactory {

    @Override
    public Color getColor() {
        return ColorEnum.RED.getColor();
    }

    @Override
    public Shape getShape() {
        return ShapeEnum.SQUARE.getShape();
    }

}
