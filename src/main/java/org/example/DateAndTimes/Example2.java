package org.example.DateAndTimes;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Example2 {

    public static void main(String[] args) {

        LocalDateTime ld = LocalDateTime.of(2022, Month.NOVEMBER, 6, 1, 30);
        System.out.println("LocalDateTime: " + ld);

        ZonedDateTime date1 = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        System.out.println("ZonedDateTime date1: " + date1);

        ZonedDateTime date2 = date1.plusHours(1);
        System.out.println("ZonedDateTime date2: " + date2);

        System.out.println(date1.getHour()+" "+date2.getHour());

    }
}
