package cn.itcast.day10.demo01;

public class Demo01Final {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);

        num1 = 20;
        System.out.println(num1);

        final int num2 = 20;
        System.out.println(num2);

        //num2 = 30;

        final int num3;
        num3 = 30;

        Student student = new Student("ZhaoLiYin");
        System.out.println(student);
        System.out.println(student.getName());

        student = new Student("HuoJianHua");
        System.out.println(student);
        System.out.println(student.getName());

        final Student student2 = new Student("GaoYuanYuan");
        System.out.println(student2.getName());

//        student2 = new Student("ZhaoYouTing");
        student2.setName("GaoYuanYuanYuan");
        System.out.println(student2.getName());
    }
}
