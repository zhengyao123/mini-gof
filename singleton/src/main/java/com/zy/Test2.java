package com.zy;

import com.zy.singleton.HungrySingleton;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * date:  2020-08-27 11:20
 *
 * @author zhengyao
 */
public class Test2 {
    public static void main(String[] args) throws Exception {

        Class<HungrySingleton> clazz = HungrySingleton.class;
        Constructor c = clazz.getDeclaredConstructor();
        c.setAccessible(true);
        HungrySingleton a  = (HungrySingleton) c.newInstance();
        System.out.println("反射创建出来的对象"+a);

        Field[] files = clazz.getDeclaredFields();
        for (Field file : files) {
            file.setAccessible(true);
            HungrySingleton singleton1 = (HungrySingleton) file.get(HungrySingleton.getInstance());
            System.out.println("拿到单例模式创建的对象: " + singleton1);


            file.set(HungrySingleton.getInstance(), a); //把反射创建出来的对象赋值给单例对象
            System.out.println("第二次拿到单例模式创建的对象: " + HungrySingleton.getInstance());
        }
    }
}
