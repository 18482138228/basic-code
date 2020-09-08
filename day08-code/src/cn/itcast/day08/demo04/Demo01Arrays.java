package cn.itcast.day08.demo04;

import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {10,20,30,23};
        String instr = Arrays.toString(intArray);
        System.out.println(instr);

        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}
