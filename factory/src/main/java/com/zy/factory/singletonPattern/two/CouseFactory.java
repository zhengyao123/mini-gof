package com.zy.factory.singletonPattern.two;

/**
 * date:  2020-08-26 16:38
 *
 * @author zhengyao
 */
public class CouseFactory {

    public ICourse creat(String name) {
        //如果增加课程，还得修改代码
//        if ("java".equals(name)) {
//            return new JavaCourse();
//        } else if ("python".equals(name)) {
//            return new PythonCourse();
//        } else {
//            return null;
//        }

        //入参不够灵活
        try {
            if (!(null == name || "".equals(name))) {
                return (ICourse) Class.forName(name).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ICourse creat2(Class<?> clazz) {
        try {
            if (null != clazz) {
                return (ICourse) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
