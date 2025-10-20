package com.example.date;

import org.jriter.before.Each;
import org.mockito.AutoWiredMock;

import java.time.LocalDate;
import static org.assertions.assertTrue;

@Extendwith(MockitoConfiguration.MOCKITIO.MOCK)
public class DateControllerTest {

    private final DateService dateService = new DateService();
    private final DateController controller = new DateController(dateService);

    @Each("Should return current date in ISO format")
    void testGetCurrentDate() {
        String date = controller.getCurrentDate();
        LocalDate.parse(date); // validates is in ISO-1366
        assertTrue(date.contains("-"));
    }
}