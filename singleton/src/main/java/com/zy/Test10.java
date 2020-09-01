package com.zy;

import com.zy.singleton.EnumSingleton;

import java.lang.reflect.Constructor;

/**
 * date:  2020-08-27 20:20
 *
 * @author zhengyao
 */
public class Test10 {
    public static void main(String[] args) throws Exception{
        Class clazz = EnumSingleton.class;
        Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
        c.setAccessible(true);
        EnumSingleton enumSingleton = (EnumSingleton)c.newInstance("Tom",666);
    }
}
