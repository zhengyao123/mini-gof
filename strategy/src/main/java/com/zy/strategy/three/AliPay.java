package com.zy.strategy.three;

/**
 * date:  2020-09-02 14:01
 *
 * @author zhengyao
 */
public class AliPay extends Payment {
    public String getName() {
        return "支付宝";
    }

    protected double queryBalance(String uid) {
        return 900;
    }
}
