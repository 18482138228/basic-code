package cn.itcast.day08.demo03;

public class Demo01StaticField {
    public static void main(String[] args) {
        Student stu1 = new Student("何超1",18);
        stu1.room = "UESTC";
        Student stu2 = new Student("何超2",19);
        System.out.println(stu2.room);
    }
}
