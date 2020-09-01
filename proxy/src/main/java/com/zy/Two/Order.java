package com.zy.Two;

/**
 * date:  2020-08-28 16:51
 *
 * @author zhengyao
 */
public class Order {
    private Object orderInfo;
    private Long createTime;
    private String id;

    @Override
    public String toString() {
        return "Order{" +
                "orderInfo=" + orderInfo +
                ", createTime=" + createTime +
                ", id='" + id + '\'' +
                '}';
    }

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
