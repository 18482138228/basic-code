package cn.itcast.day07.demo03;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(3);//0-2
        System.out.println(num);
    }

}
