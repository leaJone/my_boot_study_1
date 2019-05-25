package com.study.hc.thread.chapter2;

public class VisibilityTest {

    private volatile boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("开始了");
        VisibilityTest visibilityTest = new VisibilityTest();
        Thread thread = new Thread(() -> {
            int i = 0;
            while (visibilityTest.flag) {
                i++;
            }
            System.out.println(i);
            System.out.println("代码终止了");
        });
        thread.start();
//        TimeUnit.NANOSECONDS.sleep(1);
        visibilityTest.flag = false;
        System.out.println("被置为false了");
    }
}
