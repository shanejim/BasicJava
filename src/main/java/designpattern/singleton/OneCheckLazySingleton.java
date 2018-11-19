package designpattern.singleton;

/**
 * @author shanejim
 * @description synchronized单锁懒汉模式
 * @date 2018/11/18
 */
public class OneCheckLazySingleton {
    private static OneCheckLazySingleton instance;

    private OneCheckLazySingleton() {
    }

    public static synchronized OneCheckLazySingleton getInstance() {
        if (instance == null) {
            instance = new OneCheckLazySingleton();
        }
        return instance;
    }
}
