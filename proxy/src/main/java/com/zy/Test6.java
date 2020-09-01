package com.zy;

import com.zy.six.CglibMeipo;
import com.zy.six.Customer2;
import net.sf.cglib.core.DebuggingClassWriter;

/**
 * date:  2020-09-01 11:43
 *
 * @author zhengyao
 */
public class Test6 {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D://cglib_proxy_class/");


        Customer2 instance = (Customer2)new CglibMeipo().getInstance(Customer2.class);
        instance.findLove();
    }
}
