package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int num = r.nextInt(33) + 1;
            list.add(num);
        }
        System.out.println(list);

    }
}
