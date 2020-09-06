package cn.itcast.day06.demo04;

public class Student {
    private String name;
    private int age;
    public Student(){
        System.out.println("构造方法执行了");
    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

}
