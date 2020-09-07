package cn.itcast.day08.demo02;

public class Demo02StringGet {
    public static void main(String[] args) {
        int a = "sdsadsfdfdgtjytt".length();
        System.out.println(a);

        String str1 = "Hello";
        String str2 = "World";

        String str3 = str1.concat(str2);

        char ch = "Hello".charAt(1);
        System.out.println(ch);

        int index = "HelloWorld".indexOf("llo");
        System.out.println(index);

    }
}
