package com.zy;

import com.zy.Two.Order;
import com.zy.Two.OrderService;
import com.zy.Two.OrderServiceSaticProxy;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * date:  2020-08-28 16:40
 *
 * @author zhengyao
 */
public class Test2 {
    public static void main(String[] args) throws ParseException {
        OrderService orderService = new OrderService();

        Order order = new Order();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf.parse("2020/02/01");
        order.setCreateTime(date.getTime());

        OrderServiceSaticProxy orderServiceSaticProxy = new OrderServiceSaticProxy(orderService);
        orderServiceSaticProxy.createOrder(order);
    }
}
