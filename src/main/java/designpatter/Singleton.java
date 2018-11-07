package designpatter;

/**
 * @description: 单例模式
 * @author: panshenjia
 * @create: 2018-11-02 15:06
 **/
public class Singleton {

    private Singleton(){}

    public static Singleton getInstance(){
        return SingletonInstance.instance;
    }

    private static class SingletonInstance{

        static Singleton instance = new Singleton();

    }
}