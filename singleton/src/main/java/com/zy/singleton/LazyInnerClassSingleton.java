package com.zy.singleton;

/**
 * date:  2020-08-27 14:03
 *
 * @author zhengyao
 */
public class LazyInnerClassSingleton {
    //默认使用 LazyInnerClassGeneral 的时候，会先初始化内部类
    //如果没使用的话，内部类是不加载的
    private LazyInnerClassSingleton() {
    }

    //每一个关键字都不是多余的
    // static 是为了使单例的空间共享
    // 保证这个方法不会被重写，重载
    public static LazyInnerClassSingleton getInstance() {
        System.out.println(11);
        return LazyHolder.LAZY;
    }

    //默认不加载
    private static class LazyHolder {
       private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

}
