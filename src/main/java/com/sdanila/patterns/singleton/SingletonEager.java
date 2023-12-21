package com.sdanila.patterns.singleton;

public class SingletonEager {

    private static SingletonEager uniqueInstance = new SingletonEager();

    private SingletonEager() {
    }

    //this is thread safe, but will use resources even when the instance id not used
    public static SingletonEager getInstance() {
        return uniqueInstance;
    }
}
