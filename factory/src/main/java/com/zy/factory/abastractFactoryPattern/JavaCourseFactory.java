package com.zy.factory.abastractFactoryPattern;

/**
 * date:  2020-08-26 17:50
 *
 * @author zhengyao
 */
public class JavaCourseFactory implements ICourseFactory{
    public ICourse record() {
        return new JavaCourse();
    }

    public INote note() {
        return new JavaNote();
    }
}
