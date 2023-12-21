package com.sdanila.patterns.singleton;

public class SingletonSynchronized {

    private static SingletonSynchronized uniqueInstance;

    private SingletonSynchronized() {
    }

    //this is  thread safe, but it effects performance
    public static synchronized SingletonSynchronized getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonSynchronized();
        }
        return uniqueInstance;
    }
}
