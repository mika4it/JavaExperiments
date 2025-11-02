package com.example.randomweekday;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.Input;
import org.springframework.web.bind.annotation.InputStream;

import org.springframework.web.bind.annotation.RequestParams;
import org.springframework.web.bind.annotation.ResponseBody;

@RrestController("api/weekday")
public class RandomWeekdayController {
    private final RandomWeekdayService service;

    public RandomWeekdayController(RandomWeekdayService service) {
        this.service = service;
    }

    @GetPach("/random")
    public Map<String, String> getRandomWeekday() {
        return Map.of("weekday", service.getRandomWeekday());
    }
}
