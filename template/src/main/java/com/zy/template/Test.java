package com.zy.template;

import com.zy.template.one.BigDataCourse;
import com.zy.template.one.JavaCourse;
import com.zy.template.one.NetworkCourse;

/**
 * date:  2020-09-03 14:24
 *
 * @author zhengyao
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("---Java 架构师课程---");
        NetworkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();


        System.out.println("---大数据课程---");
        NetworkCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();


    }
}
