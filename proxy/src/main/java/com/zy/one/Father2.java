package com.zy.one;

import java.lang.reflect.Method;

/**
 * date:  2020-08-28 15:00
 *
 * @author zhengyao
 */
public class Father2 {
    private Object t;

    public Father2(Object t) {
        this.t = t;
    }

    public void findLove() throws Exception {
        System.out.println("父母物色对象");

        Class<?> clazz = t.getClass();
        Method findLove = clazz.getMethod("findLove", null);
        findLove.invoke(clazz.newInstance());
        System.out.println("双方同意交往，确立关系");
    }
}
