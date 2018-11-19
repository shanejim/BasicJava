package designpattern.singleton;

/**
 * @author shanejim
 * @description 懒汉模式单例
 * @date 2018/11/18
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
