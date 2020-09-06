package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("电子科技大学1");
        list.add("电子科技大学2");
        list.add("电子科技大学3");
        list.add("电子科技大学4");
        list.add("电子科技大学5");
        for (int i = 0;i <= list.size()-1; i++){
            System.out.println(list.get(i));
        }
    }
}
