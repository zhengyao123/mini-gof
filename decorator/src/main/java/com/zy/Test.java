package com.zy;

import com.zy.decorator.one.Battercake;
import com.zy.decorator.one.BattercakeWithEgg;
import com.zy.decorator.one.BattercakeWithEggAndSausage;

/**
 * date:  2020-09-07 13:40
 *
 * @author zhengyao
 */
public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getMsg() + ",总价格：" + battercake.getPrice());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getMsg() + ",总价格：" + battercakeWithEgg.getPrice());

        Battercake battercakeWithEggAndSausage = new BattercakeWithEggAndSausage();
        System.out.println(battercakeWithEggAndSausage.getMsg() + ",总价格：" + battercakeWithEggAndSausage.getPrice());
    }
}
