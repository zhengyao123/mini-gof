package com.zy.template.one;

/**
 * date:  2020-09-03 14:20
 *
 * @author zhengyao
 */
public class BigDataCourse extends NetworkCourse {

    private boolean needHomeworkFlag=false;

    public BigDataCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    void checkHomework() {
        System.out.println("检查大数据的课后作业");
    }

    @Override
    protected boolean needHomework() {
        return this.needHomeworkFlag;
    }
}