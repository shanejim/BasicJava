package javabasic.multithread;

public class DoJoin {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                MyThread tempjt = new MyThread("MyThread");
                try {
                    tempjt.start();
                    tempjt.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + i);
        }
    }

}
