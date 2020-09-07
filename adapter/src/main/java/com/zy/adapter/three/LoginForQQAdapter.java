package com.zy.adapter.three;

import com.zy.adapter.two.ResultMsg;

/**
 * date:  2020-09-03 16:23
 *
 * @author zhengyao
 */
public class LoginForQQAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return new ResultMsg(200, "QQ登陆成功");
    }
}
