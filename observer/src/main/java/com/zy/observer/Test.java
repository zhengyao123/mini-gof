package com.zy.observer;

import com.zy.observer.one.GPer;
import com.zy.observer.one.Question;
import com.zy.observer.one.Teacher;

/**
 * date:  2020-09-07 16:01
 *
 * @author zhengyao
 */
public class Test {
    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");

        gper.addObserver(tom);
        gper.addObserver(mic);

        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者模式适用于哪些场景？");
        gper.publishQuestion(gper, question);
    }
}

