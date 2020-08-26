package com.zy.factory.singletonPattern.two;

/**
 * date:  2020-08-26 16:34
 *
 * @author zhengyao
 */
public class Test {
    public static void main(String[] args) {
//        ICourse course=new JavaCourse();
//        course.record();


//        CouseFactory couseFactory = new CouseFactory();
//        ICourse java = couseFactory.creat("java");
//        java.record();

//        CouseFactory couseFactory = new CouseFactory();
//        ICourse creat = couseFactory.creat("com.zy.factory.singletonPattern.two.JavaCourse");
//        creat.record();


        CouseFactory couseFactory = new CouseFactory();
        ICourse creat = couseFactory.creat2(JavaCourse.class);
        creat.record();
    }
}
