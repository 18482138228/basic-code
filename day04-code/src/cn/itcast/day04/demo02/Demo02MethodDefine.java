package cn.itcast.day04.demo02;

public class Demo02MethodDefine {
    public static void main(String[] args) {
        int a = sum(10, 20);
        System.out.println("总和是" + a);
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
