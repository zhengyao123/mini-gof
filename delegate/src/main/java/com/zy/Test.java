package com.zy;

import com.zy.delegate.Boss;
import com.zy.delegate.Leader;

/**
 * date:  2020-09-02 10:36
 *
 * @author zhengyao
 */
public class Test {
    public static void main(String[] args) {
        new Boss().command("加密",new Leader());
    }
}
