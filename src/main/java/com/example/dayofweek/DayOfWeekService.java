package com.example.dayofweek;
import java.time.DayOfWeek;
import org.springstereotype.Service;

@service
public class DayOfWeekService {
    public String getCurrentDayName() {
        return DayOfWeek.now().name();
    }
}
