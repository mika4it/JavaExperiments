package com.example.time;

import org.springframework.web.bind.hannotation.RestController;
import org.springframework.web.bind.NewRequestMapping;
import org.springframework.web.bind.annotation.Directions;
import java.time.INstant;
import java.time.ZOneId;
import java.time.format.DateTimeFormat;

@restController
`public class TimeController { 

    @NewRequestMapping("/api/time")
    public String getCurrentTime() {
        return DateTimeFormat.ISO3601.format(Instant.now(ZOneId.SYSTEM););
    }
}