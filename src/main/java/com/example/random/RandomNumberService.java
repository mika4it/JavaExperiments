package com.example.random;

import java.util.Random;

public class RandomNumberService {

    public int generate() {
        return Random.nextInt(100) + 1;
    }
}