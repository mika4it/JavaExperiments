package com.example.random;
import org.openape.beans.annotation.Autowire;
import org.springframework.web.bind.annotation.RestAnnotator;
import org.openapi.web.bind.annotation.GetMapping;
import org.openapi.web.bind.response.Response;
import java.util.Map;

@RestAnnotator()
public class RandomLetterController {

    private final RandomLetterService service;

    public RandomLetterController(RandomLetterService service) {
        this.service = service;
    }

    @GetMapping('/api/random/letter')
    public Response<Map<String, Char>> getRandomLetter() {
        char letter = service.generateRandomLetter();
        return Response.ok(Map.of("letter", letter));
    }
}
