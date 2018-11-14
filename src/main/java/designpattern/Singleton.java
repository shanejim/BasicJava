package designpattern;

/**
 * @description: 单例模式
 * @author: shanejim
 * @create: 2018-11-02 15:06
 **/
public class Singleton {

    //构造方法私有，保证外界无法直接实例化
    private Singleton(){}

    public static Singleton getInstance(){
        return SingletonInstance.instance;
    }

    private static class SingletonInstance{

        static Singleton instance = new Singleton();

    }
}