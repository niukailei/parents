package com.guava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class demo3 {

    public static void main(String[] args) throws ParseException {

      // System.out.println(1556290813776l*((long)1<<22));
        System.out.println(1557666728l* TimeUnit.MICROSECONDS.convert(1, TimeUnit.MILLISECONDS));
        System.out.println(10 | 4);
        //1001
        //1000
        //110000
        //String s="19700909";
        Long a=1480166465631L;
        Date g=new Date(a);
        SimpleDateFormat d=new SimpleDateFormat("yyyymmdd");
        String format = d.format(a);
        System.out.println(format);
        //System.out.println(time);
        //System.out.println("---------");
        //System.out.println(System.currentTimeMillis());
    }
}
