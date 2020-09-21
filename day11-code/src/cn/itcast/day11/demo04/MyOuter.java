package cn.itcast.day11.demo04;

//new出来的对象在堆内存中
//局部变量跟着方法走，在栈内存中
//

public class MyOuter {
    public void methodOuter() {
        final int num = 10;
        class MyInner {
            public void methodInner() {
                System.out.println(num);
            }
        }
    }

}
