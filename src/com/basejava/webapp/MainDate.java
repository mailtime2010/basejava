package com.basejava.webapp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class MainDate {

    private static final String DATE_FORMAT = "dd-M-yyyy hh:mm:ss a";

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Date date = new Date();
        System.out.println(date);//the same
        System.out.println("Differ: " + (System.currentTimeMillis() - start));

        Calendar calendar = Calendar.getInstance();
        //System.out.println(calendar);
        calendar.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        System.out.println(calendar.getTime());//the same
        System.out.println();

        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        LocalDateTime ltd = LocalDateTime.of(ld, lt);
        System.out.println(ltd);
        System.out.println();

        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
        TimeZone tz = TimeZone.getDefault();
        System.out.println("TimeZone : " + tz);
        System.out.println("TimeZone : " + tz.getID() + " - " + tz.getDisplayName());
        // From TimeZone Asia/Singapore
        System.out.println("Date (Ukraine) : " + formatter.format(date));
        System.out.println();

      /* String dateInString = "22-1-2015 10:15:55 AM";
        LocalDateTime ldt = LocalDateTime.parse(dateInString, DateTimeFormatter.ofPattern("dd-M-yyyy hh:mm:ss a"));
        ltd = LocalDateTime.parse("June 21, 2018 12:01 АМ",
                DateTimeFormatter.ofPattern("ММММ dd',' уууу hh':'mm а"));
        System.out.println(ltd.format(DateTimeFormatter.ofPattern("ММММ d',' уууу h':'mm а")));
      */
        SimpleDateFormat sdf = new SimpleDateFormat("<YY><MM><dd>");
        System.out.println(sdf.format(date));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YY/MM/dd");
        System.out.println(dtf.format(ltd));
        System.out.println();

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
        System.out.println();

        SimpleDateFormat simpledf = new SimpleDateFormat("hh:mm:ss");
        System.out.println(simpledf.format(date));
        simpledf = new SimpleDateFormat("dd MMM yyyy hh:mm:ss zzz");
        System.out.println(simpledf.format(date));
        simpledf = new SimpleDateFormat("E d M y h:m:s z");
        System.out.println(simpledf.format(date));
        System.out.println();

        sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2002);
        cal.set(Calendar.MONTH, Calendar.AUGUST);
        cal.set(Calendar.DAY_OF_MONTH, 25);
        cal.set(Calendar.MINUTE, 00);
        cal.set(Calendar.SECOND, 00);
        System.out.println("set date: " + sdf.format(cal.getTime()));
        cal.set(Calendar.MONTH, Calendar.FEBRUARY);
        System.out.println("month changed : " + sdf.format(cal.getTime()));
        cal.set(Calendar.DAY_OF_MONTH, 25);
        System.out.println("day changed : " + sdf.format(cal.getTime()));
        // if day 31 or 30 and month february be careful
        cal.add(Calendar.SECOND, 75);
        System.out.println("add 75 ms: " + sdf.format(cal.getTime()));
        cal.add(Calendar.MONTH, 1);
        System.out.println("add 1 month: " + sdf.format(cal.getTime()));


    }
}
