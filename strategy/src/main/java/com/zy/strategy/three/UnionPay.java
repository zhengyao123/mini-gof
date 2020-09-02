package com.zy.strategy.three;

/**
 * date:  2020-09-02 14:05
 *
 * @author zhengyao
 */
public class UnionPay extends Payment {
    public String getName() {
        return "银联支付";
    }

    protected double queryBalance(String uid) {
        return 120;
    }
}
