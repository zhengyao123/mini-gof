package com.zy.adapter.three;

import com.zy.adapter.two.ResultMsg;

/**
 * date:  2020-09-03 16:25
 *
 * @author zhengyao
 */
public class LoginForTokenAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
