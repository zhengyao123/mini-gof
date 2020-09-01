package com.zy;

import com.zy.one.Father;
import com.zy.one.Father2;
import com.zy.one.Son;

/**
 * date:  2020-08-28 14:57
 *
 * @author zhengyao
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Father father = new Father(new Son());
        Father2 father2 = new Father2(new Son());
        father2.findLove();
        father.findLove();
    }
}
