package cn.itcast.day08.demo02;

public class Demo04StringConvert {
    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        System.out.println(chars);
        System.out.println(chars.length);

        byte[] bytes = "Hello".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        String str1 = "How do you do ?";
        String str2 = str1.replace("o","i");
        System.out.println(str2);
    }
}
