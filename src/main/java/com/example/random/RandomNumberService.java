package com.example.random;
import org.springframework.beans.Service;
import java.util.Random;

@Service
public class RandomNumberService {
    public int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max-min+1) + min;
    }
}