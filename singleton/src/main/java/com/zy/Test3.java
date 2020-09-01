package com.zy;

import com.zy.singleton.LazySimpleSingleton;
import com.zy.singleton.LazySimpleSingleton2;

/**
 * date:  2020-08-27 11:31
 *
 * @author zhengyao
 */
public class Test3 {
    public static void main(String[] args) {

        new Thread(() -> {
            LazySimpleSingleton2 instance = LazySimpleSingleton2.getInstance();
            System.out.println(instance);
        }, "A").start();

        new Thread(() -> {
            LazySimpleSingleton2 instance = LazySimpleSingleton2.getInstance();
            System.out.println(instance);

        }, "B").start();

    }
}
