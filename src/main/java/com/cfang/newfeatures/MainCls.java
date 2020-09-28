package com.cfang.newfeatures;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author cfang 2020/9/24 17:03
 * @description
 */
public class MainCls {

    private static Map<String, Moniter> moniterMap = Maps.newHashMap();

    public static void main(String[] args) {
        moniterMap.put("1", (int a, int b) -> add(a, b));

        Moniter moniter = moniterMap.get("1");

        System.out.println(moniter.moniterAdd(1,2));

    }

    private static int add(int a, int b){
        return a + b;
    }
}
