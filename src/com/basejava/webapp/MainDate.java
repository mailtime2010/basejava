package com.basejava.webapp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class MainDate {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Date date = new Date();
        System.out.println(date);
        System.out.println(System.currentTimeMillis() - start);
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        calendar.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        System.out.println(calendar.getTime());

        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        LocalDateTime ltd = LocalDateTime.of(ld, lt);
        System.out.println(ltd);

       /* ltd = LocalDateTime.parse("June 21, 2018 12:01 АМ",
                DateTimeFormatter.ofPattern("ММММ dd',' уууу hh':'mm а"));
        System.out.println(ltd.format(DateTimeFormatter.ofPattern("ММММ d',' уууу h':'mm а")));
       */
        SimpleDateFormat sdf = new SimpleDateFormat("<YY><MM><dd>");
        System.out.println(sdf.format(date));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YY/MM/dd");
        System.out.println(dtf.format(ltd));

        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.JAPAN);
        System.out.println("Япония : " + df.format(date));
        df = DateFormat.getDateInstance(DateFormat.LONG, Locale.JAPAN);
        System.out.println("Япония : " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.CHINA);
        System.out.println("Китай : " + df.format(date));
        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA);
        System.out.println("Китай : " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        System.out.println("США : " + df.format(date));
        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        System.out.println("США : " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.getDefault());
        System.out.println("Украина : " + df.format(date));
        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.getDefault());
        System.out.println("Украина : " + df.format(date));

        SimpleDateFormat simpledf = new SimpleDateFormat("hh:mm:ss");
        System.out.println(simpledf.format(date));
        simpledf = new SimpleDateFormat("dd MMM yyyy hh:mm:ss zzz");
        System.out.println(simpledf.format(date));
        simpledf = new SimpleDateFormat("E d M y h:m:s z");
        System.out.println(simpledf.format(date));
    }
}
