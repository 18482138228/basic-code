package cn.itcast.day12.demo01;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "aBC";
        String s3 = null;
        System.out.println(s1.equals(s2));

        boolean b2 = Objects.equals(s1,s2);

        System.out.println(s2.equals(null));
    }
}
