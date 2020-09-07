package cn.itcast.day08.demo03;

public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass my = new MyClass();
        my.method();

        MyClass.methodStatic();
    }

}
