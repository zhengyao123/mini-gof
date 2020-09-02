package com.zy.delegate;

/**
 * date:  2020-09-02 10:34
 *
 * @author zhengyao
 */
public class Boss {
    public void command(String command, Leader leader) {
        leader.doing(command);
    }
}
