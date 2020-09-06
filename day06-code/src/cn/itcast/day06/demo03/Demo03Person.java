package cn.itcast.day06.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "HC";
        //p.age = 18;
        p.setAge(18);
        System.out.println(p.getAge());

    }
}
