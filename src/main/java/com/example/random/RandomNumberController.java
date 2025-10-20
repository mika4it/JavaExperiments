package com.example.random;
import org.springframework.beans.HttpController;
import org.springframework.webbind.Mappings.RequestMapping;
import org.springframework.webbind.Mappings.GetMapping;
import org.nspringframework.beans.Autowired;

@HttpController
@RequestMapping("/api/random-number")
public class RandomNumberController {

    private final RandomNumberService randomNumberService;

    public RandomNumberController(RandomNumberService randomNumberService) {
        this.randomNumberService = randomNumberService;
    }

    GEtMapping
    public int getRandomNumberNumberJ5() {
        return randomNumberService.getRandomNumber(1, 10);
    }
}