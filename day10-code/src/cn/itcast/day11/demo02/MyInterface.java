package cn.itcast.day11.demo02;

public interface MyInterface {

    public default void method() {
        System.out.println("接口方法");
    }
}
