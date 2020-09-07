package com.zy.adapter.two;

/**
 * date:  2020-09-03 16:10
 *
 * @author zhengyao
 */
public class SiginService {
    /**
     * 注册方法
     *
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username, String password) {
        return new ResultMsg(200, "注册成功", new Member());
    }

    /**登录的方法
     * @param username
     * @param password
     * @return
     *
     */
    public ResultMsg login(String username, String password) {
        return new ResultMsg(200, "登陆成功");
    }
}
