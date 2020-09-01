package com.zy;

import com.zy.one.Person;
import com.zy.three.Customer;
import com.zy.three.JDKMeipo;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

/**
 * date:  2020-08-31 08:16
 *
 * @author zhengyao
 */
public class Test3 {
    public static void main(String[] args) {
        try{

        Person o = (Person) new JDKMeipo().getInstance(new Customer());
        o.findLove();

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
        FileOutputStream os = null;

            os = new FileOutputStream("D://$Proxy0.class");
            os.write(bytes);
            os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
