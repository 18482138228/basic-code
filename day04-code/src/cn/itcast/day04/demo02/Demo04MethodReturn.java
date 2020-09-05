package cn.itcast.day04.demo02;

public class Demo04MethodReturn {
    public static void main(String[] args) {
        int num = getSum(1, 2);
        System.out.println(num);
        System.out.println("*****************");

        printSum(1,3);
    }

    public static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void printSum(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }
}
