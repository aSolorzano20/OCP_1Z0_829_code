package org.example.ControlFlow;

import java.time.LocalDate;

import static java.time.DayOfWeek.*;

public class TestSwith {

    public static void main(String[] args) {
        var day = LocalDate.now().with(FRIDAY).getDayOfWeek();
        System.out.println("Day: " + day);

        switch(day){
            case MONDAY,
                TUESDAY,
                WEDNESDAY,
                THURSDAY,
                FRIDAY:
                System.out.println("working");
            case SATURDAY,
                SUNDAY:
                System.out.println("off");
        }
    }
}
