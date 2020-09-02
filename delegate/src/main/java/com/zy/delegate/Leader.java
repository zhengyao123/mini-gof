package com.zy.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * date:  2020-09-02 10:30
 *
 * @author zhengyao
 */
public class Leader implements IEmployee {

    Map<String, IEmployee> targets = new HashMap<String, IEmployee>();

    public Leader() {
        targets.put("加密", new EmployeeA());
        targets.put("登录", new EmployeeB());
    }

    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
