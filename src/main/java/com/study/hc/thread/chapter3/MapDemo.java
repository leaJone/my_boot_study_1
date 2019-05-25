package com.study.hc.thread.chapter3;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {


    public static void main(String[] args) {
        Map hashMap = new ConcurrentHashMap();
        hashMap.put("1", "1");
        System.out.println(hashMap.size());
        hashMap.put("1", "1");
        System.out.println(hashMap.size());
        hashMap.put("1", "1");
        System.out.println(hashMap.size());
        hashMap.put("1", "1");
        System.out.println(hashMap.size());
        hashMap.put("1", "1");
        System.out.println(hashMap.size());
        hashMap.put("1", "1");
        System.out.println(hashMap.size());
        hashMap.put("1", "1");
        System.out.println(hashMap.size());
        hashMap.put("1", "1");
        System.out.println(hashMap.size());
        hashMap.put("1", "1");
        System.out.println(hashMap.size());
        hashMap.put("1", "1");
        System.out.println(hashMap.size());
        hashMap.put("1", "1");
        System.out.println(hashMap.size());

    }
}
