package designpattern.simplefactory;

/**
 * @author shanejim
 * @description todo
 * @date 2018/11/18
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
