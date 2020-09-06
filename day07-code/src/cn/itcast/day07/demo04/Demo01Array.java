package cn.itcast.day07.demo04;

public class Demo01Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person("李易峰1",18);
        Person two = new Person("李易峰2",18);
        Person three = new Person("李易峰3",18);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        Person p = array[1];

    }
}
