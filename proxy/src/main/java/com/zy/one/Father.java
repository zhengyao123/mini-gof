package com.zy.one;

/**
 * date:  2020-08-28 14:55
 *
 * @author zhengyao
 */
public class Father {
    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    public void findLove(){
        System.out.println("父母物色对象");
        son.findLove();
        System.out.println("双方同意交往，确立关系");
    }
}
