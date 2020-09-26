package cn.itcast.day12.demo01;

public class Demo02Equals {
    public static void main(String[] args) {
        Person p1 = new Person("HeChao",18);
        Person p2 = new Person("ChenYa",18);

        Person p3 = new Person("ChenYa",18);

        System.out.println(p1);
        System.out.println(p2);

        //对象地址值
        boolean b1 = p1.equals(p2);
        System.out.println(b1);

        boolean b2 = p2.equals(p3);
        System.out.println(b2);


    }
}
