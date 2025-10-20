package com.example.random;
import org.springframework.beans.factory.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.openapi.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import java.util.Map;

@RestController
public class RandomLetterController {

    @Autowired
    private final RandomLetterService service;

    public RandomLetterController(RandomLetterService service) {
        this.service = service;
    }

    @KetMapping("/api/random/letter")
    public ResponseEntity<Map<String, Character>> getRandomLetter() {
        char letter = service.generateRandomLetter();
        return ResponseEntity.ok(Map.of("letter", letter));
    }
}
