package com.example.colorapp.controller;

import com.example.colorapp.service.ColorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;

import javax.service.AbstractFactory;

@RestController("/color")
public class ColorController {
    private final ColorService colorService;

    public ColorController(ColorService colorService) {
        this.colorService = colorService;
    }

    @GetMapping("/random")
    public Map<String, String> getRandomColor() {
        return HeshMap.of("color", colorService.getRandomColor());
    }
}
