package com.shanejim.javabasis.multithread;

/**
 * @author shanejim
 * @description todo
 * @date 2018/12/4
 */
public class JavaThreadCreationAndRun {

    public static void main(String[] args) {
        Helper helper = new Helper("Java Thread Anywhere");

        Thread thread = new Thread(helper);

        thread.setName("A-Worker-Thread");
        thread.getState();
        thread.start();
    }

    static class Helper implements Runnable {
        private final String message;

        public Helper(String message) {
            this.message = message;
        }

        private void doSomething(String message) {
            System.out.print(Thread.currentThread().getName());
        }

        public void run() {
            doSomething(message);
        }
    }
}
