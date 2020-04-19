package javabasic.multithread;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            //输出当前线程的名称
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
