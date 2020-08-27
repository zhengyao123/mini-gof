package com.zy;

import com.zy.singleton.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * date:  2020-08-27 15:07
 *
 * @author zhengyao
 */
public class Test4 {
    public static void main(String[] args) throws Exception {
        LazyInnerClassSingleton.getInstance();

        Class<LazyInnerClassSingleton> clazz = LazyInnerClassSingleton.class;
        Constructor c = clazz.getDeclaredConstructor();
        c.setAccessible(true);

        Object o = c.newInstance();
        System.out.println(o);
//
//        Field[] fields = clazz.getDeclaredFields();
//        for (Field field : fields) {
//            field.setAccessible(true);
//            LazyInnerClassSingleton o2 = (LazyInnerClassSingleton)field.get(LazyInnerClassSingleton.getInstance());
//            System.out.println("-----"+o2);
//        }
    }
}
