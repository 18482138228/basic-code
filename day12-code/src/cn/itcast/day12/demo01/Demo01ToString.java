package cn.itcast.day12.demo01;

public class Demo01ToString {

    public static void main(String[] args) {
        Person person = new Person("HeChao",18);
        String s = person.toString();
        System.out.println(s);
        System.out.println(person);
    }
}
