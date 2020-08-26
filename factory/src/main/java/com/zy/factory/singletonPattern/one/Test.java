package com.zy.factory.singletonPattern.one;

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
    }
}
