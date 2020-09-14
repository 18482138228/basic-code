package cn.itcast.day11.demo02;

public abstract class MyInterfaceAbstract implements MyInterfaceA, MyInterfaceB {

    public void methodDefault() {
        System.out.println("覆盖重写");
    }

}
