package cn.itcast.day12.demo03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01DateFormate {
    public static void main(String[] args) throws ParseException {
        //demo01();
        demo02();
    }

    public static void demo01() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String s = sdf.format(date);
        System.out.println(s);
        System.out.println(date);
    }

    public static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date d = sdf.parse("2020年10月12日 23时22分11秒");


        System.out.println(d);
    }
}
