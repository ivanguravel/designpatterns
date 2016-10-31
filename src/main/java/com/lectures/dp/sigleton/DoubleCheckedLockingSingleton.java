package com.lectures.dp.sigleton;

/**
 * @author Ivan_Zhuravel
 */
public class DoubleCheckedLockingSingleton {

    private static volatile DoubleCheckedLockingSingleton instance;

    public static DoubleCheckedLockingSingleton getInstance() {
        DoubleCheckedLockingSingleton localInstance = instance;
        if (localInstance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return localInstance;
    }
}
