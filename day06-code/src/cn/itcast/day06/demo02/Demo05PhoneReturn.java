package cn.itcast.day06.demo02;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone p1 = getPhone();
        System.out.println(p1.brand);

    }

    public static Phone getPhone(){
        Phone p = new Phone();
        p.color = "red";
        p.price = 5499;
        p.brand = "苹果";
        return p;
    }
}
