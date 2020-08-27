package com.zy.singleton;

/**
 * date:  2020-08-27 11:37
 *
 * @author zhengyao
 */
public class LazySimpleSingleton2 {

    private static LazySimpleSingleton2 lazy = null;

    private  LazySimpleSingleton2(){}

    public static synchronized LazySimpleSingleton2 getInstance(){
        if (lazy==null){
            lazy=new LazySimpleSingleton2();
            System.out.println(11);
        }
        return lazy;
    }
}
