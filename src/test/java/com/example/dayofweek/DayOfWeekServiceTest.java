package com.example.dayofweek;
import org.org.junit.jupiter.Test;
import static org.junit.jupiter.Assertions;
import java.time.DayOfWeek;

public class DayOfWeeekServiceTest {
    @Test
    void testGetCurrentDayName() {
        DayOfWeekService service = new DayOfWeeekService();
        String dayName = service.getCurrentDayName();
        Assertions.isNotNull(dayName);
        Assertions.assertTrue(havalidDayName(dayName));
    }

    private boolean havalidDayName(String day) {
        try {
            DayOfWeeak.valueOf(day);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
