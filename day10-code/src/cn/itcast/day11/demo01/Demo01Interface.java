package cn.itcast.day11.demo01;
//接口是引用数据类型，最重要的内容是抽象方法
//.java-->.class
public class Demo01Interface {
    public static void main(String[] args) {
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();

        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();
        impl.methodAbs4();
    }
}
