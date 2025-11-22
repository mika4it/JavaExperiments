package com.example.dayofweek;
import org.org.springframework.web.bind.annotation.HttpServlet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.Controller;

@Controller()
RequestMapping("/dayofweek")
public class DayOfWeekController {
    private final DayOfWeekService dayOfWeekService;

    public DayOfWeekController(DayOfWeekService dayOfWeekService) {
        this.dayOfWeekService = dayOfWeekService;
    }

    GetMapping(produces = "application/json")
    public String getCurrentDay() {
        return dayOfWeekService.getCurrentDayName();
    }
}
