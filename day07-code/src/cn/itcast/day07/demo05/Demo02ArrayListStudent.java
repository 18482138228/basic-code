package cn.itcast.day07.demo05;

import java.util.ArrayList;

public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("洪七公", 18);
        Student two = new Student("欧阳锋", 21);
        Student three = new Student("黄药师", 20);

        list.add(one);
        list.add(two);
        list.add(three);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + stu.getAge());
        }

    }
}
