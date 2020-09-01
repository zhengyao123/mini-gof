package com.zy.five;

import java.lang.reflect.Method;

/**
 * date:  2020-08-31 14:48
 *
 * @author zhengyao
 */
public interface MyInvocationHandler {

    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
