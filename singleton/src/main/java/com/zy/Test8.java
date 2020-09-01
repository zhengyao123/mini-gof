package com.zy;

import com.zy.singleton.EnumSingleton;

import java.io.*;

/**
 * date:  2020-08-27 20:10
 *
 * @author zhengyao
 */
public class Test8 {
    public static void main(String[] args) throws Exception {
        EnumSingleton s1 = null;
        EnumSingleton s2 = EnumSingleton.getInstance();
        s2.setData(new Object());

        FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s2);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("EnumSingleton.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        s1 = (EnumSingleton) ois.readObject();
        ois.close();

        System.out.println(s1.getData());
        System.out.println(s2.getData());
        System.out.println(s1.getData()==s2.getData());
    }
}
