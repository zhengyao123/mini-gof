package com.zy.singleton;

/**
 * date:  2020-08-27 11:47
 *
 * @author zhengyao
 */
public class LazySimpleSingleton3 {

    //为什么volatile
    //new 的过程1.分配内存空间 2.初始化对象 3.设置lazy指向公共分配的内存地址
    //jvm 指令重排
    //线程A,B，A执行1,3B进入，判断lazy不为空，返回了lazy，此时lazy还未实例化好
    private volatile static LazySimpleSingleton3 lazy = null;

    private LazySimpleSingleton3(){}

    private static LazySimpleSingleton3 getInstance(){
        if (lazy==null){
            synchronized (LazySimpleSingleton.class){
                //为什么
                //线程A，线程B 都通过第一个空判断
                //线程A抢占锁成功，实例完成
                //线程B进入，如果不判断就再次实例
                if (lazy==null){
                    lazy=new LazySimpleSingleton3();
                }
            }
        }
        return lazy;
    }
}
