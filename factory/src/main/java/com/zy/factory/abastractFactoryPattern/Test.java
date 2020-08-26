package com.zy.factory.abastractFactoryPattern;

/**
 * date:  2020-08-26 16:34
 *
 * @author zhengyao
 */
public class Test {
    public static void main(String[] args) {
        ICourseFactory java=new JavaCourseFactory();
        java.record().record();
        java.note().note();
    }
}
