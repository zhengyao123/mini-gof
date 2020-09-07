package com.zy.decorator;


import com.zy.decorator.two.BaseBattercake;
import com.zy.decorator.two.Battercake;
import com.zy.decorator.two.EggDecorator;
import com.zy.decorator.two.SausageDecorator;

/**
 * date:  2020-09-07 14:06
 *
 * @author zhengyao
 */
public class Test2 {
    public static void main(String[] args) {
        Battercake battercake;
        //路边摊买一个煎饼
         battercake = new BaseBattercake();
        // 煎饼有点小，想再加一个鸡蛋
         battercake = new EggDecorator(battercake);
        // 再加一个鸡蛋
         battercake = new EggDecorator(battercake);
        // 很饿，再加根香肠
        battercake = new SausageDecorator(battercake);
        //跟静态代理最大区别就是职责不同
        // 静态代理不一定要满足 is-a 的关系
        // 静态代理会做功能增强，同一个职责变得不一样
        // 装饰器更多考虑是扩展
         System.out.println(battercake.getMsg() + ",总价：" + battercake.getPrice());
    }
}
