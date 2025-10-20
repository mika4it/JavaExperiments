package com.example.games.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("healthcheck")
public class HealthcheckController {


    @GetMapping("status")
    public String getStatus() {
        return "ok";
    }
}
