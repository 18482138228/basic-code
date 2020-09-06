package cn.itcast.day05.demo03;

public class Demo07ArrayReverse {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int len = array.length;
        for (int i = 0; i < len/2; i++) {
            int temp = array[i];
            array[i] = array[len-1-i];
            array[len-1-i] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
