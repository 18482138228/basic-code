package cn.itcast.day08.demo02;

public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));

        System.out.println(str1.equals(str3));

        System.out.println(str3.equals("Hello"));

        System.out.println("Hello".equals(str3));

        String str4 = "hello";
        System.out.println(str1.equals(str4));

        System.out.println("*************************");

        String str5 = null;//"abc"
        System.out.println("abc".equals(str5));

        System.out.println(str5.equals("abc"));


    }
}
