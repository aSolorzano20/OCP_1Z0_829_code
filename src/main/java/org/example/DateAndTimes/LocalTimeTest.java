package org.example.DateAndTimes;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeTest {

    public static void main(String[] args) {

        LocalTime now = LocalTime.of(9, 30);
        LocalTime gameStart = LocalTime.of(10, 15);
        long timeConsumed = 0;
        long timeToStart = 0;

        System.out.println(now.isBefore(gameStart));
        if(now.isBefore(gameStart)) {
            timeConsumed = gameStart.until(now, ChronoUnit.MINUTES);
        }
        else {
            timeToStart = now.until(gameStart, ChronoUnit.HOURS);
        }

        System.out.println(timeToStart + " " + timeConsumed);
    }
}
