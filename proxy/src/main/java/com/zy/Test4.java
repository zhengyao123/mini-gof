package com.zy;

import com.zy.Two.IOrderService;
import com.zy.Two.Order;
import com.zy.Two.OrderService;
import com.zy.four.OrderServiceDynamicProxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * date:  2020-08-31 08:56
 *
 * @author zhengyao
 */
public class Test4 {
    public static void main(String[] args) throws ParseException {
        Order order = new Order();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf.parse("2018/02/01");
        order.setCreateTime(date.getTime());
        IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService());
        orderService.createOrder(order);
    }
}
