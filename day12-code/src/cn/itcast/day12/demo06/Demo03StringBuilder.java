package cn.itcast.day12.demo06;

public class Demo03StringBuilder {
    public static void main(String[] args) {
        String s1 = "abc";
        StringBuilder stringBuilder = new StringBuilder(s1);
        String s2 = stringBuilder.toString();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }
}
