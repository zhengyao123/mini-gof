package com.zy.strategy.one;

/**
 * date:  2020-09-02 11:12
 *
 * @author zhengyao
 */
public class CashbackStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("返现促销,返回的金额转到支付宝账号");
    }
}
