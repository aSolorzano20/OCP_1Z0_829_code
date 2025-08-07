package org.example.DateAndTimes;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime gameStart = LocalTime.of(10, 15);
        LocalTime now = LocalTime.now();
        long timeConsumed = 0;

        System.out.println("gameStart: " + gameStart);
        System.out.println("Now: " + now);

        if(now.isAfter(gameStart)) {
            timeConsumed = gameStart.until(now, ChronoUnit.HOURS);
            System.out.println("TimeConsumed: " + timeConsumed);
        }
        else{

        }
    }

}
