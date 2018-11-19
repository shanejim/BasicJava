package designpattern.factory;

import designpattern.factory.common.Circle;
import designpattern.factory.common.Rectangle;
import designpattern.factory.common.Shape;
import designpattern.factory.common.Square;

/**
 * @author shanejim
 * @description todo
 * @date 2018/11/18
 */
public class ShapeFactory {

    //使用 createShape 方法获取形状类型的对象
    public Shape createShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}