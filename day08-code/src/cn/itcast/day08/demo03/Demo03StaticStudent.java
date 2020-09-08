package cn.itcast.day08.demo03;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        Student.room = "UESTC";

        Student stu1 = new Student("何超1",18);
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        System.out.println(stu1.getId());

        Student stu2 = new Student("何超2",20);
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());
        System.out.println(stu2.getId());

    }
}
