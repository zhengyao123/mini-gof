package com.zy.strategy.one;

/**
 * date:  2020-09-02 11:15
 *
 * @author zhengyao
 */
public class EmptyStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
