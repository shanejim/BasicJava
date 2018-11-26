package designpattern.factory.factorymethod;

import designpattern.factory.common.Shape;

/**
 * @author shanejim
 * @description todo
 * @date 2018/11/26
 */
public class FactoryMethodPatternDemo {

    public static void main(String[] args) {
        ShapeCreator rectangleCreator = new RectangleCreator();
        Shape rectangle = rectangleCreator.factory();
        rectangle.draw();

        ShapeCreator squareCreator = new SquareCreator();
        Shape square = squareCreator.factory();
        square.draw();

        ShapeCreator circleCreator = new CircleCreator();
        Shape circle = circleCreator.factory();
        circle.draw();
    }
}
