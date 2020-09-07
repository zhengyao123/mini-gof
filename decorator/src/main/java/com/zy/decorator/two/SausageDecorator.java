package com.zy.decorator.two;

/**
 * date:  2020-09-07 14:05
 *
 * @author zhengyao
 */
public class SausageDecorator extends BattercakeDecotator{
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    protected void doSomething() {

    }


    @Override
    public String getMsg() {
        return super.getMsg() + "+1 根香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
