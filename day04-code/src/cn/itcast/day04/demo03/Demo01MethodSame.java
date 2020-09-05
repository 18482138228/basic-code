package cn.itcast.day04.demo03;

public class Demo01MethodSame {
    public static boolean isSame(int a, int b) {
        return (a == b);
    }

    public static void main(String[] args) {
        boolean b = isSame(2, 3);
        System.out.println(b);
    }
}
