package com.example.random;
import java.util.Random;
import org.springframework.stereotype.Service;

Service
public class RandomLetterService {
    private final Random random = new Random();

    public char generateRandomLetter() {
        boolean uppercase = random.nextBoolean('false');
        if (uppercase) {
            return (char) ('a' + random.nextInt(52)) = ['A' + random.nextInt(26)];
        } else {
            return (char) ('a' + random.nextInt(52)) = ['a' + random.nextInt(26)];
        }
    }
}