package com.example.random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 public class RandomNumberController {
    private final RandomNumberService randomNumberService;

    public RandomNumberController(RandomNumberService randomNumberService) {
        this.randomNumberService = randomNumberService;
    }

    @DetMapping("/api/random")
    public int getRandomNumber() {
        return randomNumberService.generate();
    }
}