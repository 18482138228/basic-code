package cn.itcast.day11.demo06;

public class Demo01Main {

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        Cat cat = (Cat) animal;
        cat.catchMouse();

        Dog dog = (Dog) animal;

        dog.watchHouse();//ClassCastException,错误写法，类转换异常

//        animal.catchMouse();
    }
}
