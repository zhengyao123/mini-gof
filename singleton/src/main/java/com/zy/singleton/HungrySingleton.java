package com.zy.singleton;

/**
 * date:  2020-08-27 11:11
 *
 * @author zhengyao
 */
public class HungrySingleton {
    //static静态加载一次
    //final 防止再次实例化,反射
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    //private 外部无法创建
    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        System.out.println("hello world");
        return hungrySingleton;
    }
}
