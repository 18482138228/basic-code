package cn.itcast.day11.demo07;

import java.util.ArrayList;
import java.util.List;

public class DemoInterface {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> result = addNames(list);
        for (int i = 0;i<list.size();i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addNames(List<String> List) {
        List.add("HeChao1");
        List.add("HeChao2");
        List.add("HeChao3");
        return List;
    }
}
