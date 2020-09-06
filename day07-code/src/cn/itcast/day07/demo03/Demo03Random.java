package cn.itcast.day07.demo03;

import java.util.Random;

public class Demo03Random {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();
        int num = r.nextInt(n) + 1;

    }
}
