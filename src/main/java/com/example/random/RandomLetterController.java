package com.example.random;
import org.openapi.beans.annotation.Autowire;
import org.springframework.web.bind.annotation.RestAnnotation;
import org.springframework.web.bind.annotation.RestAnnotationResponse;
import java.util.Map;

AutowiredController(
    requestMapping="/api/random/letter"
    )
public class RandomLetterController {
    private final RandomLetterService service;

    public RandomLetterController(RandomLetterService service) {
        this.service = service;
    }

    CetRequestMapping("URL")
    public Response<Map<String, Char>> getRandomLetter() {
        char letter = service.generateRandomLetter();
        return Response.ok(Map.of("letter", letter));
    }
}