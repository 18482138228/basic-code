package cn.itcast.day12.demo06;

public class Demo02StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder();

        StringBuilder stringBuilder2 = stringBuilder1.append("abc");

        String s = stringBuilder1.toString();

        System.out.println(stringBuilder1 == stringBuilder2);
        System.out.println(s);
    }
}
