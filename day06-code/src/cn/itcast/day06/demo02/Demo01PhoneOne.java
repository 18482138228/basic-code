package cn.itcast.day06.demo02;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);

        System.out.println("***************");
        one.brand = "苹果";
        one.color = "red";
        one.price = 5499;
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);

        one.call("马云");
    }
}
