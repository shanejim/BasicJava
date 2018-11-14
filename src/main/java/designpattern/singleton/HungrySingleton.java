package designpattern.singleton;

/**
 * @author shanejim
 * @description 饿汉单例模式
 * @date 2018/11/14
 */
public class HungrySingleton {
    private HungrySingleton() {
    }

    private static HungrySingleton instance = new HungrySingleton();

    private static HungrySingleton getInstance() {
        return instance;
    }
}
