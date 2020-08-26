package com.zy.factory.abastractFactoryPattern;

/**
 * date:  2020-08-26 17:50
 *
 * @author zhengyao
 */
public class PythonCourseFactory implements ICourseFactory {
    public ICourse record() {
        return new PythonCourse();
    }

    public INote note() {
        return new PythonNote();
    }
}
