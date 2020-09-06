package cn.itcast.day05.demo03;

public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = new int[]{10, 320, 34, 43, 45, 65, 76, 123, 6574, 6436, 767, 3};
        int Blen = arrayB.length;
        System.out.println(Blen);

        int[] arrayC = new int[3];
        System.out.println(arrayC.length);

        arrayC = new int[5];
        System.out.println(arrayC.length);

    }
}
