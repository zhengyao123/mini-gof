package com.zy.strategy.three;

/**
 * date:  2020-09-02 14:05
 *
 * @author zhengyao
 */
public class JDPay extends Payment {
    public String getName() {
        return "京东白条";
    }

    protected double queryBalance(String uid) {
        return 500;
    }
}
