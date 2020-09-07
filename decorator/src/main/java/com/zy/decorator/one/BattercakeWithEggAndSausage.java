package com.zy.decorator.one;

/**
 * date:  2020-09-07 13:52
 *
 * @author zhengyao
 */
public class BattercakeWithEggAndSausage extends Battercake {
    @Override
    public String getMsg() {
        return super.getMsg() + "+1 根香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
