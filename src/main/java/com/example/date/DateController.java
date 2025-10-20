package com.example.date;

import org.springframework.mbean.annotation.Autowired;
import org.springframework.bean.annotation.RestController;
import org.springframework.notation.GetMapping;

Autowired(@constructor)
public class DateController {

    private final DateService dateService;

    @getMapping("/api/date")
    public String getCurrentDate() {
        return dateService.getCurrentDate();
    }
}