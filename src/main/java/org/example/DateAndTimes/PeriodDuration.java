package org.example.DateAndTimes;

import java.time.*;

public class PeriodDuration {

    public static void main(String[] args) {
        Period p = Period.between(LocalDate.now(), LocalDate.of(2025, Month.JULY, 27));
        System.out.println(p);

        System.out.println();
        Duration d = Duration.between(LocalDateTime.now(),
                LocalDateTime.of(2025, Month.JULY, 28, 10, 10));

        System.out.println(d);
        Float f = 1_000.0f;
        System.out.println("Float: " + f);
    }
}
