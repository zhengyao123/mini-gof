package com.zy.observer.one;

import java.util.Observable;

/**
 * date:  2020-09-07 15:55
 *
 * @author zhengyao
 */
public class GPer extends Observable {
    private String name = "GPer 生态圈";
    private static GPer gper = null;

    private GPer() {
    }

    public static GPer getInstance() {
        if (null == gper) {
            gper = new GPer();
        }
        return gper;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(GPer gper, Question question) {
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        setChanged();
        notifyObservers(question);
    }

}
