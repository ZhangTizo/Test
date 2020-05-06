package com.ahstu;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Good!");
        int x = 100;
        System.out.println("x = " + x);
        x = x + 100;
        System.out.println("x = " + x);
        int n = x + 100;
        System.out.println("n = " + n);
        int i = 0xff0000;
        System.out.println(i);
        long l = 9000000000000000L;
        System.out.println(l);
        double pi = 3.14;
        System.out.println(pi);
        char c = '\u4e2d';  //十六进制4e2d是十进制的20013，在Unicode编码中表示的字符为“中”
        System.out.println(c);
        int[] ns = new int[5];  //新建数组方法1
        ns[0] = 12;
        ns[1] = 35;
        ns[2] = 567;
        ns[3] = 45;
        ns[4] = 94;
        System.out.println(Arrays.toString(ns));    //打印数组元素
        System.out.println(ns.length);  //打印数组长度
        int[] array = {23, 235, 747, 934, 936, 67};  //新建数组方法2
        int[] arrays = new int[]{12, 9647, 345};  //新建数组方法3
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrays));
    }
}
