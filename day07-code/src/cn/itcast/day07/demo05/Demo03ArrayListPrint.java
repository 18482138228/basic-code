package cn.itcast.day07.demo05;

import java.util.ArrayList;

public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("电子科技大学1");
        list.add("电子科技大学2");
        list.add("电子科技大学3");
        list.add("电子科技大学4");
        printArrayList(list);

    }

    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (i == list.size() - 1) {
                System.out.print(s + "}");
            } else {
                System.out.print(s + "@");
            }

        }
    }
}