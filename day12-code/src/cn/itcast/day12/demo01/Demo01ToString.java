package cn.itcast.day12.demo01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo01ToString {

    public static void main(String[] args) {
        Person person = new Person("HeChao",18);
        String s = person.toString();
        System.out.println(s);
        System.out.println(person);

        Random r = new Random();
        System.out.println(r);

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
    }
}
