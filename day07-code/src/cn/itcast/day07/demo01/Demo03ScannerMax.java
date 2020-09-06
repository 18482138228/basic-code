package cn.itcast.day07.demo01;

import java.util.Scanner;

public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
    }

    public static int getMax(int a, int b, int c) {
        int temp = (a > b) ? a : b;
        int max = (temp > c) ? temp : c;
        return max;
    }
}
