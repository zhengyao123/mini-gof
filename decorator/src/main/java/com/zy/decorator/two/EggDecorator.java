package com.zy.decorator.two;

/**
 * date:  2020-09-07 14:04
 *
 * @author zhengyao
 */
public class EggDecorator extends BattercakeDecotator {


    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    protected void doSomething() {

    }

    @Override
    public String getMsg() {
        return super.getMsg() + "+1 个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() +1;
    }
}
