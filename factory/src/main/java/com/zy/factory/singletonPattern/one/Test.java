package com.zy.factory.singletonPattern.one;

import java.math.BigDecimal;

/**
 * date:  2020-08-26 16:34
 *
 * @author zhengyao
 */
public class Test {
    public static void main(String[] args) {
        ICourse course=new JavaCourse();
        course.record();
        //此时如果正价Python扩展就不方便

        BigDecimal a=new BigDecimal(22.33);
        BigDecimal b=new BigDecimal(22.331);
        System.out.println(a.compareTo(b));
    }
}
