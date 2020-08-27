package com.zy.singleton;


/**
 * date:  2020-08-27 19:22
 * jad EnumSingleton.java
 * @author zhengyao
 */
public enum  EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
