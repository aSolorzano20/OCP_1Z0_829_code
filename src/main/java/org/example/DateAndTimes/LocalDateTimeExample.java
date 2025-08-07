package org.example.DateAndTimes;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime ld = LocalDateTime.of(2022, Month.NOVEMBER, 6, 1, 30);
        System.out.println("LocalDateTime: " + ld);

        LocalDateTime date2 = ld.plusHours(1).plusMinutes(45).plusSeconds(10);
        System.out.println("LocalDateTime date2: " + date2);
    }
}
