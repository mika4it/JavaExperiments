package com.example.games.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("healthcheck")
@RestController
public class HealthcheckController {


    @GetMapping("status")
    public String getStatus() {
        return "ok";
    }
}
