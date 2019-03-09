package factory.enums;

import factory.factory.AbstractArtFactory;
import factory.factory.BlueCircleFactory;
import factory.factory.RedSquareFactory;

public enum FactoryProducer {
    BLUE_CIRCLE_FACTORY(new BlueCircleFactory()),
    RED_SQUARE_FACTORY(new RedSquareFactory());

    private AbstractArtFactory factory;

    FactoryProducer(AbstractArtFactory factory){
        this.factory = factory;
    }

    public AbstractArtFactory getFactory() {
        return factory;
    }
}
