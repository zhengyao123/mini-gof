package com.zy.adapter.three;

import com.zy.adapter.two.ResultMsg;

/**
 * date:  2020-09-03 16:24
 *
 * @author zhengyao
 */
public class LoginForTelAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
