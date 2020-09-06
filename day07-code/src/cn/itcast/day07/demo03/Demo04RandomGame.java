package cn.itcast.day07.demo03;

import java.util.Random;
import java.util.Scanner;

public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int target = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
        while (true) {
            int num = sc.nextInt();
            if (num == target) {
                System.out.println("猜对了");
                break;
            } else if (num >= target) {
                System.out.println("太大了");
            } else {
                System.out.println("太小了");
            }
        }
    }


}
