package cn.itcast.day11.demo05;

public class DemoMain {

    public static void main(String[] args) {
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.method();

        MyInterface obj = new MyInterfaceImpl();
        obj.method();

        MyInterface obj2 = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };

        obj2.method();
        
    }
}
