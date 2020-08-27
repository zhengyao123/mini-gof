package com.zy;

import com.zy.singleton.LazyInnerClassSingleton;
import com.zy.singleton.LazyInnerClassSingleton2;

import java.lang.reflect.Constructor;

/**
 * date:  2020-08-27 15:07
 *
 * @author zhengyao
 */
public class Test5 {
    public static void main(String[] args) throws Exception {
        LazyInnerClassSingleton.getInstance();

        Class<LazyInnerClassSingleton2> clazz = LazyInnerClassSingleton2.class;
        Constructor c = clazz.getDeclaredConstructor();
        c.setAccessible(true);

        Object o = c.newInstance();
        Object o1 = c.newInstance();

        System.out.println(o);

    }
}
