package cn.itcast.day06.demo02;

public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 5499;
        one.color = "red";
        method(one);
    }

    public static void method(Phone p){
        System.out.println(p.price);
        System.out.println(p.color);
        System.out.println(p.brand);

    }
}
