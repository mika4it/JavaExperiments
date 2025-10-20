package com.example.randomweekday;

import java.util.List;
import java.util.Arrays;
import java.util.Random;

public class RandomWeekdayService {
    private static final List<String> WEEK_DAYS = Arrays.asList("monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday");

    public String getRandomWeekday() {
        Random random = new Random();
        return WEEK_DAYS.get(random.nextInt(WEEK_DAYS.size()));
    }
}
