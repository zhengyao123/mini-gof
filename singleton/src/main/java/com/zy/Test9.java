package com.zy;

import com.zy.singleton.EnumSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * date:  2020-08-27 20:16
 *
 * @author zhengyao
 */
public class Test9 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = EnumSingleton.class;
        Constructor c = clazz.getDeclaredConstructor();
        c.setAccessible(true);

        c.newInstance();
    }
}
