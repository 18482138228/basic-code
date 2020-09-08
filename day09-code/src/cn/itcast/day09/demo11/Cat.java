package cn.itcast.day09.demo11;

//子类必须重写抽象父类中的所有抽象方法
public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("吃鱼");
    }
}
