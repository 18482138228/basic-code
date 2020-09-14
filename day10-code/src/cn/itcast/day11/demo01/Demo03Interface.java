package cn.itcast.day11.demo01;

public class Demo03Interface {
    public static void main(String[] args) {
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

        MyInterfaceStatic.methodStatic();
//        impl.methodStatic();
    }
}
