package com.zy.singleton;

import java.io.Serializable;

/**
 * date:  2020-08-27 16:07
 *
 * @author zhengyao
 * 序列化会破坏
 */
public class SeriableSingleton implements Serializable {

    private static final SeriableSingleton singleton = new SeriableSingleton();

    //序列化就是说把内存中的状态通过转换成字节码的形式
    // 从而转换一个 IO 流，写入到其他地方(可以是磁盘、网络 IO)
    // 内存中状态给永久保存下来了
    //
    // 反序列化
    // 讲已经持久化的字节码内容，转换为 IO 流
    // 通过 IO 流的读取，进而将读取的内容转换为 Java 对象
    // 在转换过程中会重新创建对象 new

    private SeriableSingleton() {
    }

    public static SeriableSingleton getInstance() {
        return singleton;
    }

    private Object readResolve() {
        return singleton;
    }

}
