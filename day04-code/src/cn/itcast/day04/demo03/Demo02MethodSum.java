package cn.itcast.day04.demo03;

public class Demo02MethodSum {
    public static void main(String[] args) {
        int sum = getSum(100);
        System.out.println(sum);
    }

    public static int getSum(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        return sum;
    }
}
