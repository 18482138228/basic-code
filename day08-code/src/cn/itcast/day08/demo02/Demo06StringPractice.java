package cn.itcast.day08.demo02;


public class Demo06StringPractice {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3};
        String s = fromArrayToString(array);
        System.out.println(s);

    }

    public static String fromArrayToString(int[] array) {
        String str1 = "[";
        for (int i = 0; i < array.length ;i++) {
            if (i == array.length - 1) {
                str1 += "word" + array[i] + "]";
            } else {
                str1 += "word" + array[i] + "#";
            }
        }
        return str1;

    }
}
