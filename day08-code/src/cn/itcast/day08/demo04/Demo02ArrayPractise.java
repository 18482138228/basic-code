package cn.itcast.day08.demo04;

import java.util.Arrays;

public class Demo02ArrayPractise {

    public static void main(String[] args) {
        String str1 = "sdasdgfcjnbyre";
        char[] chars = str1.toCharArray();

        Arrays.sort(chars);

        System.out.println(chars);

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
