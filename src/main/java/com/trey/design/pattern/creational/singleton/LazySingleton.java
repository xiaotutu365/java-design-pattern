package com.trey.design.pattern.creational.singleton;

/**
 * 懒汉式
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    /**
     * 私有构造器
     */
    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}