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

        Object o1 = c.newInstance();
        Object o2 = c.newInstance();
        System.out.println(o1);
        System.out.println(o2);

    }
}
