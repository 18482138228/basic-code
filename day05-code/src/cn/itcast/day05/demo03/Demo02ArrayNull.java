package cn.itcast.day05.demo03;

public class Demo02ArrayNull {
    public static void main(String[] args) {
        int[] array = null;//所有引用变量可以赋值为null;
        System.out.println(array[0]);//空指针异常，NullPointerException;
    }
}
