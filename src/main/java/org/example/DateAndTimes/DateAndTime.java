package org.example.DateAndTimes;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateAndTime {

    public static void main(String[] args) {

        LocalDateTime ld1 = LocalDateTime.of(2022, Month.NOVEMBER, 6, 2, 0);
        ZonedDateTime zd1 = ZonedDateTime.of(ld1, ZoneId.of("US/Eastern"));
        System.out.println("ld1: " + ld1);
        System.out.println("zd1: " + zd1);
        System.out.println();

        LocalDateTime ld2 = LocalDateTime.of(2022, Month.NOVEMBER, 6, 1, 0);
        ZonedDateTime zd2 = ZonedDateTime.of(ld2, ZoneId.of("US/Eastern"));
        System.out.println("ld2: " + ld2);
        System.out.println("zd2: " + zd2);
        System.out.println();

        long x = ChronoUnit.HOURS.between(zd1, zd2);
        System.out.println(x);
        System.out.println();

        long y = ChronoUnit.HOURS.between(zd2, zd1);
        System.out.println(y);
    }
}
