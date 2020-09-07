package com.zy.template.three;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
/**
 * date:  2020-09-03 14:40
 *
 * @author zhengyao
 */
public abstract class Study {

    private String name;

    static Map<String, Object> target = new HashMap<String, Object>();

    static {
        target.put("java",new JavaStudy());
        target.put("Python",new PythonStudy());
    }

    public final void beginStudy() {

        this.openComputer();

        this.select(name);

        this.sayByb();
    }

    abstract void selectEnd();


    protected void sayByb() {
        System.out.println("say byb");
    }

    protected void select(String name) {
        if (StringUtils.isNoneBlank(name)){
        }
    }

    protected void openComputer() {
        System.out.println("open computer");
    }

}
