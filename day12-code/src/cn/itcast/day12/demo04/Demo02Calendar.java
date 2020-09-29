package cn.itcast.day12.demo04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo02Calendar {
    public static void main(String[] args) {
        //demo01();
        //demo02();
        //demo03();
        demo04();

    }

    public static void demo01() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);

        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);

        int day = calendar.get(Calendar.DATE);
        System.out.println(day);
    }

    public static void demo02() {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, 2088);

        calendar.set(Calendar.MONTH, 10);

        System.out.println(calendar.get(Calendar.YEAR));

        System.out.println(calendar.get(Calendar.MONTH));

    }

    public static void demo03() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 2);
        calendar.add(Calendar.MONTH, -2);

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));


    }

    public static void demo04() {
        Calendar calendar = Calendar.getInstance();

        Date time = calendar.getTime();

        System.out.println(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年mm月dd日");
        String format = sdf.format(time);
        System.out.println(format);


        long time1 = time.getTime();

        System.out.println(time1);


    }
}
