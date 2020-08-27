package com.zy.singleton;

/**
 * date:  2020-08-27 11:29
 *
 * @author zhengyao
 */
public class LazySimpleSingleton {

    //静态代码块，公共内存区
    private static LazySimpleSingleton lazy = null;

    private LazySimpleSingleton(){}

    //存在线程安全问题
    public static LazySimpleSingleton getInstance(){
        if (lazy==null){
            lazy=new LazySimpleSingleton();
            System.out.println(11);
        }
        return lazy;
    }

}
