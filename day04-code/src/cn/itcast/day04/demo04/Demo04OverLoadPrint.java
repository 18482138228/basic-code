package cn.itcast.day04.demo04;

import cn.itcast.day04.demo01.HelloWorld;

public class Demo04OverLoadPrint {
    public static void myPrint(byte num) {
        System.out.println(num);
    }

    public static void myPrint(short num) {
        System.out.println(num);
    }

    public static void myPrint(int num) {
        System.out.println(num);
    }

    public static void myPrint(long num) {
        System.out.println(num);
    }

    public static void myPrint(float num) {
        System.out.println(num);
    }

    public static void myPrint(double num) {
        System.out.println(num);
    }

    public static void myPrint(char num) {
        System.out.println(num);
    }

    public static void myPrint(boolean num) {
        System.out.println(num);
    }

    public static void myPrint(String str) {
        System.out.println(str);
    }


    public static void main(String[] args) {
        myPrint("HelloWorld");
    }
}
