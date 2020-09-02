package com.zy.strategy;

import com.zy.strategy.one.CashbackStrategy;
import com.zy.strategy.one.CouponStrategy;
import com.zy.strategy.one.PromotionActivity;
import org.apache.commons.lang.StringUtils;

/**
 * date:  2020-09-02 11:22
 *
 * @author zhengyao
 */
public class Test2 {
    public static void main(String[] args) {
        PromotionActivity promotionActivity = null;
        String promotionKey = "COUPON";
        if (StringUtils.equals(promotionKey, "COUPON")) {
            promotionActivity = new PromotionActivity(new CouponStrategy());
        } else if (StringUtils.equals(promotionKey, "CASHBACK")) {
            promotionActivity = new PromotionActivity(new CashbackStrategy());
        }//......
        promotionActivity.execute();
    }
}
