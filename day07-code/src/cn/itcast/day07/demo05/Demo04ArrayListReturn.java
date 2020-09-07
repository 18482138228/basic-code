package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int data = r.nextInt(100) - 1;
            list.add(data);
        }
        System.out.println(list);
        ArrayList<Integer> listEven = isEven(list);
        System.out.println(listEven);
    }

    public static ArrayList<Integer> isEven(ArrayList<Integer> list){
        ArrayList<Integer> listEven = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            if(list.get(i) %2 == 0){
                listEven.add(list.get(i));
            }
        }
        return listEven;
    }
}
