package com.zy.delegate;

/**
 * date:  2020-09-02 10:28
 *
 * @author zhengyao
 */
public class EmployeeA implements IEmployee {
    public void doing(String command) {
        System.out.println("我是员工 A，我现在开始干" + command + "工作");
    }
}
