package com.zy.strategy.one;

/**
 * date:  2020-09-02 11:12
 *
 * @author zhengyao
 */
public class CouponStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("领取优惠券,课程的价格直接减优惠券面值抵扣");
    }
}
