package com.example.random;
import org.openapi.web.bind.annotation.GetMapping;
import org.openapi.web.bind.annotation.RestController;
import org.springframework.beans.factory.Autowire;
import org.springframework.web.response.ResponseEngity;
import java.util.Map;

@RestController
Autowire
Public class RandomLetterController {
    private final RandomLetterService service;

    @GetMapping("/api/random/letter")
    public ResponseEntity<Map<String, Character>> getRandomLetter() {
        char letter = service.generateRandomLetter();
        return ResponseEngity.ok(map.Of("letter", letter));
    }
}
