package com.zy.factory.fatoryMethodPattern;

/**
 * date:  2020-08-26 17:17
 *
 * @author zhengyao
 */
public class PythonCourserFactory implements ICourseFactory {

    public ICourse creat() {
        return new PythonCourse();
    }
}
