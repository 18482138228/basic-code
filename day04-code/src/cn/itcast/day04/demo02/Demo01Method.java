package cn.itcast.day04.demo02;

public class Demo01Method {
    public static void main(String[] args) {
        printmethod();
    }
    public static void printmethod(){
        for (int i = 1;i<=5;i++){
            for (int j = 1;j<=10;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
