package com.zy;

import com.zy.five.MyMeipo;
import com.zy.one.Person;
import com.zy.three.Customer;

/**
 * date:  2020-09-01 10:38
 *
 * @author zhengyao
 */
public class Test5 {
    public static void main(String[] args) {
        try {

            Person obj = (Person) new MyMeipo().getInstance(new Customer());
            System.out.println(obj.getClass());
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
