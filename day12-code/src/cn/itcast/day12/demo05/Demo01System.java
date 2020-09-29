package cn.itcast.day12.demo05;


import java.lang.reflect.Array;

public class Demo01System {
    public static void main(String[] args) {
        //demo01();
        demo02();
    }

    public static void demo01() {
        long l1 = System.currentTimeMillis();
        for (int i = 0; i <= 9999; i++) {
            System.out.println(i);
        }
        long l2 = System.currentTimeMillis();

        long l;
        l = l2 - l1;
        System.out.println("一共耗时：" + l + "毫秒");
    }

    public static void demo02() {
        int[] src = {1,2,3,4,5};
        int[] des = {6,7,8,9,10};

        System.arraycopy(src,0,des,0,3);

        for (int i = 0; i < des.length ;i++) {
            System.out.println(des[i]);
        }
    }
}
