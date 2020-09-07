package com.zy.adapter;

import com.zy.adapter.one.AC220;
import com.zy.adapter.one.PowerAdapter;

import java.util.List;

/**
 * date:  2020-09-03 16:07
 *
 * @author zhengyao
 */
public class Test {
    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter(new AC220());
        powerAdapter.outputDC5V();

    }
}
