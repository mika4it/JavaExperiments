package com.example.colorapp.service;

import java.util.List;
import java.util.Arrays;
import java.util.Random;

public class ColorService {
    private static final List<String> COLORS = Arrays.asList("RED", "BLUE", "GREEN", "YELLOW", "ORANGE", "PUKE", "PINK", "GRAY");

    public String getRandomColor() {
        Random random = new Random();
        return COLORS.get(random.nextInt( COLORS.size() );
    }
}
