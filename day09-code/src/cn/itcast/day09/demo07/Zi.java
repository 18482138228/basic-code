package cn.itcast.day09.demo07;

public class Zi extends Fu{

    public Zi() {
        super();
        //super(20);//super的父类构造调用，必须是子类构造的第一个语句，不能子类多次调用super构造
        System.out.println("子类对象的构造方法");
    }

    public void method() {
        //super();//只有子类构造方法才能调用父类构造方法
    }
}
