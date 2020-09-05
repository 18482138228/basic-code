package cn.itcast.day05.demo01;

public class Demo04ArrayUse {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};

        System.out.println(array);//数组对应的内存地址的哈希值，[I@1b6d3586

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        int num = array[1];
        System.out.println(num);
    }
}
