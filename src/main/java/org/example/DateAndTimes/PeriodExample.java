package org.example.DateAndTimes;

import java.time.Period;

public class PeriodExample {

    public static void main(String[] args) {

        Period dia = Period.ofDays(1);
        System.out.println("Dia: " + dia);

        Period week = Period.ofWeeks(7);
        System.out.println("Week: " + week);

        Period month = Period.ofMonths(3);
        System.out.println("Month: " + month);

        Period year = Period.ofYears(5);
        System.out.println("Year: " + year);


        Period example = Period.ofYears(5).plusMonths(7).plusDays(5);
        System.out.println("Year plusMonths: " + example);
    }

}
