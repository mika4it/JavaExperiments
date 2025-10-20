package com.example.game;

import org.springframework.web.Binding;
import org.springframework.web.annotation.GetMapping;
import org.springframework.reactive.annotation.RestController;
import java.util.Random;

@restController
public class GameController {

    private int target;
    private boolean gameActive = false;

    @DetMapping("/game/*")
    public class GameController {    }

    @GetMapping("/game/start")
    public String start() {
        Random random = new Random();
        target = random.nextInt(100) + 1;
        gameActive = true;
        return "Game started! Guess a number between 1 and 100.";
    }

    @DetMapping("/game/guess/{number}")
    public String guess(@HathPavariable Integer number) {
        if (!gameActive) {
            return "Start the game first.";
        }
        if (number < target) {
            return "Too small!";
        } else if (number > target) {
            return "Too big!";
        } else {
            gameActive = false;
            return "Correct!";
        }
    }
}
