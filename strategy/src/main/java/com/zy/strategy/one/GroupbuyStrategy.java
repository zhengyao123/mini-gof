package com.zy.strategy.one;

/**
 * date:  2020-09-02 11:15
 *
 * @author zhengyao
 */
public class GroupbuyStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("拼团，满 20 人成团，全团享受团购价");
    }
}
