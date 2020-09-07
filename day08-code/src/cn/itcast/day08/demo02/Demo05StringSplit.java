package cn.itcast.day08.demo02;

public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] s = str1.split(",");
        System.out.println(s[1]);
    }
}
