package com.techreturners.exercise004;

import java.time.*;
import java.time.temporal.TemporalAmount;

public class Exercise004 {
    private LocalDate date;
    private LocalDateTime moment;


    public Exercise004(LocalDate date) {
      moment=LocalDateTime.of(date,LocalTime.MIN);
    }

    public Exercise004(LocalDateTime dateTime) {
        moment=dateTime;
    }

    public LocalDateTime getDateTime() {
        return moment.plusSeconds((long) Math.pow(10,9));
       // return moment.plusSeconds(1000000000);

    }
}
