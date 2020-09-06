package cn.itcast.day07.demo02;

public class  Demo01Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "高圆圆";
        one.showName();

        //匿名对象
        new Person().name = "赵丽颖";
        new Person().showName();
    }
}
