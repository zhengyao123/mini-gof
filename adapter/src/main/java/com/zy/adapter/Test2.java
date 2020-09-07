package com.zy.adapter;

import com.zy.adapter.two.ResultMsg;
import com.zy.adapter.two.SigninForThirdService;

/**
 * date:  2020-09-03 16:15
 *
 * @author zhengyao
 */
public class Test2 {
    public static void main(String[] args) {
        SigninForThirdService signinForThirdService = new SigninForThirdService();
        ResultMsg resultMsg = signinForThirdService.loginForQQ("11123sdsf");
        System.out.println(resultMsg);
    }
}
