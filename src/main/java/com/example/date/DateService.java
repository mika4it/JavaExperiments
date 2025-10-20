package com.example.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormat;

import org.springframework.stereotype.Service;

Service
public class DateService {

    public String getCurrentDate() {
        return LocalDate.now().toString();
    }
}