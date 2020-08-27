package com.zy;

import com.zy.singleton.SeriableSingleton;

import java.io.*;

/**
 * date:  2020-08-27 16:10
 *
 * @author zhengyao
 */
public class Test6 {
    public static void main(String[] args) {
        SeriableSingleton s1=null;
        SeriableSingleton s2 =SeriableSingleton.getInstance();

        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SeriableSingleton) ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1==s2);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
