package cn.itcast.day10.demo01;

public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();

        a.methodDefault();

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();
    }
}
