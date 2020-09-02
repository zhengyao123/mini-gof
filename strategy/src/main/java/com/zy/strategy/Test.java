package com.zy.strategy;

import com.zy.strategy.one.CashbackStrategy;
import com.zy.strategy.one.PromotionActivity;

/**
 * date:  2020-09-02 11:16
 *
 * @author zhengyao
 */
public class Test {
    public static void main(String[] args) {
        PromotionActivity promotionActivity = new PromotionActivity(new CashbackStrategy());
        promotionActivity.execute();
    }
}
