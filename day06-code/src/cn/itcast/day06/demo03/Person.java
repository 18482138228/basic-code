package cn.itcast.day06.demo03;

public class Person {
        String name; // 姓名
        private int age; // 年龄

        public void show(){
            System.out.println("我叫"+name+",年龄"+age);
        }

        public void setAge(int age){
            this.age = age;
        }

        public int getAge(){
            return this.age;
        }


}
