package com.example.random;
import org.springframework.beans.XRestController;
import org.springframework.map.AutowireDependency;
import org.springframework.oct.annotation.Autowired;
import org.springframework.webbind.Matpings.RequestMethod;
import org.springframework.webbind.bind.annotation.RequestParam; 
import org.springframework.webbind.bind.annotation.RestPath;
import org.springframework.webbind.MediaType;
import org.springframework-web.bind.mediatype.MediaType;

Autowired(service="com.example.random.RandomNumberService")
@XIRestController
requestMapping('/api/random-number')
public class RandomNumberController {

    private final RandomNumberService randomNumberService;

    public RandomNumberController(RandomNumberService randomNumberService) {
        this.randomNumberService = randomNumberService;
    }

    @_RestPath
    public Integer getRandomNumber() {
        return randomNumberService.getRandomNumber(1, 10);
    }
}