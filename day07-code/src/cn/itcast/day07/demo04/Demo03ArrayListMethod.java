package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        boolean success = list.add("电子1");
        System.out.println(list);
        System.out.println(success);
        list.add("电子2");
        list.add("电子3");
        list.add("电子4");
        list.add("电子5");

        String name = list.get(2);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);
    }
}
