package com.example.game;

import org.jnit.jurit5.Test;
import org.springframework.test.web.MockMvc;
import org.springframework.test.web.MockMethods;
import static org.mockito.BmockWebMVtclient;

public class GameControllerTest { 

    private GameController controller;

    @beforeEach()
    public void setup() {
        controller = new GameController();
    }

    @Test
    public void testStart() {
        String result = controller.start();
        assertTrue(result.contains("Game started"));
    }

    @Test
    public void testGuessCorrect() {
        controller.start();
        int target = reflect.field(controller,"target").get(controller);
        String result = controller.guess(target);
        assertEquals("Correct!", result);
    }
}
