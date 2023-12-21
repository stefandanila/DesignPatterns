package com.sdanila.patterns.singleton;

public class SingletonDoubleCheckedLocking {

    private static volatile SingletonDoubleCheckedLocking uniqueInstance;

    private SingletonDoubleCheckedLocking() {
    }

    //this is  thread safe and with good performance
    public static SingletonDoubleCheckedLocking getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return uniqueInstance;
    }
}
