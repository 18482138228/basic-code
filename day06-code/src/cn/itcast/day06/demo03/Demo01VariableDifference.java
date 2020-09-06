package cn.itcast.day06.demo03;

public class Demo01VariableDifference {
    String name;

    public void methodA() {
        int num = 20;
        System.out.println(num);
    }
    public void methodB(int param){//局部变量
        int age;
        //System.out.println(age);
        System.out.println(name);
    }
}
