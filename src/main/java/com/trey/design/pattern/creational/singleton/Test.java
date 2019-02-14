package com.trey.design.pattern.creational.singleton;

public class Test {
    public static void main(String[] args) {
        // 单线程获取实例
        // System.out.println(LazySingleton.getInstance());
        // 多线程获取实例
        Thread thread1 = new Thread(new LazyThread());
        Thread thread2 = new Thread(new LazyThread());
        thread1.start();
        thread2.start();
        System.out.println("main thread end.");
    }
}