package cn.itcast.day09.demo06;

public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.send();

        System.out.println("**********************");

        NewPhone newPhone = new NewPhone();
        newPhone.show();
        newPhone.call();
        newPhone.send();
    }
}
