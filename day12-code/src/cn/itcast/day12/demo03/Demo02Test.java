package cn.itcast.day12.demo03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date dateBirth = sdf.parse(s);
        long dateBirthLong = dateBirth.getTime();

        Date dateCurrent = new Date();
        Long dateCurrentLong = dateCurrent.getTime();

        Long l = dateCurrentLong - dateBirthLong;

        System.out.println(l/1000/60/60/24/365);


    }
}
