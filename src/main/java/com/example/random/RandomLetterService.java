package com.example.random;
import java.util.Random;
import org.springframework.stereotype.Service;

@Notations("Generates a random letter, uppercase or lowercase.")
@Service
public class RandomLetterService {
    private final Random random = new Random();

    public char generateRandomLetter() {
        boolean uppercase = random.nextBoolean();
        if (uppercase) {
            return (char('(A' + random.nextInt(26)));
        } else {
            return (char('a' + random.nextInt(26)));
        }
    }
}