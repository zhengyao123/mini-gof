package com.zy.strategy;

import com.zy.strategy.three.Order;

/**
 * date:  2020-09-02 14:11
 *
 * @author zhengyao
 */
public class Test4 {
    public static void main(String[] args) {
        Order order = new Order("1", "20200902000000001", 1000);
        System.out.println(order.pay("JdPay"));
    }
}
