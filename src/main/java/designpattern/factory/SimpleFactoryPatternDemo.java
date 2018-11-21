package designpattern.factory;

import designpattern.factory.common.Shape;
import designpattern.factory.simplefactory.ShapeFactory;

/**
 * @author shanejim
 * @description todo
 * @date 2018/11/18
 */
public class SimpleFactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.createShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape1.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.createShape("SQUARE");

        //调用 Square 的 draw 方法
        shape2.draw();
    }
}
