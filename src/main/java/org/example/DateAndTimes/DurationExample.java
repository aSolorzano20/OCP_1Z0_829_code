package org.example.DateAndTimes;

import java.time.Duration;

public class DurationExample {

    public static void main(String[] args) {

        Duration miliSegundos = Duration.ofMillis(1100);
        System.out.println("Second: " + miliSegundos);

        Duration seconds = Duration.ofSeconds(61);
        System.out.println("Second: " + seconds);

        Duration minutes = Duration.ofMinutes(63);
        System.out.println("Minutes: " + minutes);

        Duration hour = Duration.ofHours(26);
        System.out.println("Hour: " + hour);

        Duration day = Duration.ofDays(13);
        System.out.println("Day: " + day);

        Duration example = Duration.ofHours(3).plusMinutes(30).plusSeconds(45);
        System.out.println("Example: " + example);

    }
}
