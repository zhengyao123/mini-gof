package com.zy.Two;

/**
 * date:  2020-08-28 16:58
 *
 * @author zhengyao
 */
public class OrderService implements IOrderService {

    private OrderDao orderDao;

    public OrderService() {
        //如果使用 Spring 应该是自动注入的
        // 我们为了使用方便，在构造方法中将 orderDao 直接初始化了
        orderDao = new OrderDao();
    }

    public int createOrder(Order order) {
        System.out.println("OrderService 调用 orderDao 创建订单");
        return orderDao.insert(order);
    }
}
