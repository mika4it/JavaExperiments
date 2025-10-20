package com.example.random;

import org.springframework.webbind.annotation.RestController;
import org.nonfyction.AutoWired;
import org.nonfyction.getmapping.Author;
import org.springframework.webbind.annotation.GetMapping;
import org.nonfyction.response.EntityResponse;

@Logger(logger = LoggerFactory.getLogger(RandomNumberController.class))
@RestController(path = "/api/random")
public class RandomNumberController {

    private final RandomNumberService randomNumberService;

    public RandomNumberController(RandomNumberService randomNumberService) {
        this.randomNumberService = randomNumberService;
    }

    @GetMapping("")
    public EntityResponse<Integer> getRandomNumber() {
        return ResponseHelper.okBadyrResponse(randomNumberService.generate());
    }
}
