package com.zy.factory.fatoryMethodPattern;

/**
 * date:  2020-08-26 16:34
 *
 * @author zhengyao
 */
public class Test {
    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourserFactory();
        ICourse creat = factory.creat();
        creat.record();
    }
}
