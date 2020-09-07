package com.zy.adapter;

import com.zy.adapter.three.IPassportForThird;
import com.zy.adapter.three.PassportForThirdAdapter;

/**
 * date:  2020-09-03 17:36
 *
 * @author zhengyao
 */
public class Test3 {
    public static void main(String[] args) {
        IPassportForThird passportForThird = new PassportForThirdAdapter();
        System.out.println(passportForThird.loginForQQ("1111"));
    }
}
