package cn.itcast.day11.demo01;

public class MyInterfaceDefaultB implements MyInterfaceDefault{
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类B重写了默认方法");
    }
}
