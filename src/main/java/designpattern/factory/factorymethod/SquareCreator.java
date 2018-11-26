package designpattern.factory.factorymethod;

import designpattern.factory.common.Shape;
import designpattern.factory.common.Square;

/**
 * @author shanejim
 * @description todo
 * @date 2018/11/26
 */
public class SquareCreator implements ShapeCreator {
    public Shape factory() {
        return new Square();
    }
}
