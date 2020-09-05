package cn.itcast.day04.demo04;

public class Demo02MethodOverLoadSame {
    public static void main(String[] args) {
        byte a = 1;
        byte b = 2;
        System.out.println(isSame(a, b));
    }

    public static boolean isSame(byte a, byte b) {
        return (a == b);
    }

    public static boolean isSame(short a, short b) {
        return (a == b);
    }

    public static boolean isSame(int a, int b) {
        return (a == b);
    }

    public static boolean isSame(long a, long b) {
        return (a == b);
    }
}
