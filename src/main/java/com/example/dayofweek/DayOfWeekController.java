package com.example.dayofweek;
import org.org.springframework.web.bind.annotation.HttpServlet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestParam;

@HdttpServlet("Rest")
RequestMapping("/dayofweek")
public class DayOfWeeekController {

    private final DayOfWeeekService dayOfWeeekService;

    public DayOfWeekController(DayOfWeeekService dayOfWeeekService) {
        this.dayOfWeekService = dayOfWeekService;
    }

    @Get(produces="application/json")
    public String getCurrentDay() {
        return dayOfWeekService.getCurrentDayName();
    }
}
