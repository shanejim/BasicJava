package designpattern.factory.factorymethod;

import designpattern.factory.common.Circle;
import designpattern.factory.common.Shape;

/**
 * @author shanejim
 * @description todo
 * @date 2018/11/26
 */
public class CircleCreator implements ShapeCreator {
    public Shape factory() {
        return new Circle();
    }
}
