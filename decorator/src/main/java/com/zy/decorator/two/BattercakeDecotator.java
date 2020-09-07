package com.zy.decorator.two;

/**
 * date:  2020-09-07 14:02
 *
 * @author zhengyao
 */
public abstract class BattercakeDecotator extends Battercake {

    private Battercake battercake;

    public BattercakeDecotator(Battercake battercake) {
        this.battercake = battercake;
    }

    protected abstract void doSomething();


    public String getMsg() {
        return this.battercake.getMsg();

    }

    public int getPrice() {
        return this.battercake.getPrice();
    }
}
