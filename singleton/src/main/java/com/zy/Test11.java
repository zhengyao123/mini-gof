package com.zy;

import com.zy.singleton.ThreadLocalSingleton;

/**
 * date:  2020-08-28 11:20
 *
 * @author zhengyao
 */
public class Test11 {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        new Thread(() -> {
            System.out.println(ThreadLocalSingleton.getInstance());
        }).start();
        new Thread(() -> {
            System.out.println(ThreadLocalSingleton.getInstance());
        }).start();

        System.out.println("End");
    }
}
