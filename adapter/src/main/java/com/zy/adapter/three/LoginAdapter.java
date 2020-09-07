package com.zy.adapter.three;

import com.zy.adapter.two.ResultMsg;

/**
 * date:  2020-09-03 16:19
 *
 * @author zhengyao
 */
public interface LoginAdapter {
    boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);
}
