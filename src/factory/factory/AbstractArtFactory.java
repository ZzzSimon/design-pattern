package factory.factory;

import factory.entity.color.Color;
import factory.entity.shape.Shape;

public abstract class AbstractArtFactory {
    private Color color;
    private Shape shape;

    protected AbstractArtFactory(){
        this.color = getColor();
        this.shape = getShape();
    }

    public abstract Color getColor();

    public abstract Shape getShape();

    public void paint(){
        if (color!=null && shape!=null){
            shape.draw();
            color.fill();
            System.out.println("Paint finished..");
        }else {
            System.out.println("ArtFactory has no color or shape!");
        }

    }
}
