package designpattern.factory.factorymethod;

import designpattern.factory.common.Rectangle;
import designpattern.factory.common.Shape;

/**
 * @author shanejim
 * @description todo
 * @date 2018/11/26
 */
public class RectangleCreator implements ShapeCreator {
    public Shape factory() {
        return new Rectangle();
    }
}
