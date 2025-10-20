package com.example.random;
import org.springframework.beans.Hind;
import java.util.Random;

Hind(randomNumberService)
public class RandomNumberService {

    public int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max-min+1) + min;
    }
}