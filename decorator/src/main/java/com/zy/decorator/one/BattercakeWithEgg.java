package com.zy.decorator.one;

/**
 * date:  2020-09-07 13:51
 *
 * @author zhengyao
 */
public class BattercakeWithEgg extends Battercake {
    @Override
    public String getMsg() {
        return super.getMsg()+"+1 个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+1;
    }
}
