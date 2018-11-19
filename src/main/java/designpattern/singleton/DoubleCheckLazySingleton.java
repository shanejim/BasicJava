package designpattern.singleton;

/**
 * @author shanejim
 * @description 双重检查锁单例
 * @date 2018/11/18
 */
public class DoubleCheckLazySingleton {
    private volatile static DoubleCheckLazySingleton singleton;

    private DoubleCheckLazySingleton() {
    }

    public static DoubleCheckLazySingleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckLazySingleton();
                }
            }
        }
        return singleton;
    }
}
