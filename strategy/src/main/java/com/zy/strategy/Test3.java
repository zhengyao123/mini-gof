package com.zy.strategy;

import com.zy.strategy.one.PromotionActivity;
import com.zy.strategy.two.PromotionStrategyFactory;

/**
 * date:  2020-09-02 11:28
 *
 * @author zhengyao
 */
public class Test3 {
    public static void main(String[] args) {
        PromotionActivity groupbuy = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy("GROUPBUY"));
        groupbuy.execute();
    }
}
