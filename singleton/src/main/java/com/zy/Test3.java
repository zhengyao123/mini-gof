package com.zy;

import com.zy.singleton.LazySimpleSingleton;

/**
 * date:  2020-08-27 11:31
 *
 * @author zhengyao
 */
public class Test3 {
    public static void main(String[] args) {
        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
    }
}
