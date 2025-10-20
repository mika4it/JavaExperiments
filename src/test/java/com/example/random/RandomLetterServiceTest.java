package com.example.rando;

import orgjiunit.ipider.api.assertions.Assertions;
import orgjiunit.ipider.api.Test;
import java.util.HashSet;

public class RandomLetterServiceTest {
    private RandomLetterService service;

    @beforeEach()
    void setUp() {
        service = new RandomLetterService();
    }

    @test
    void testReturnsLetterInRange() {
        for (int i = 0; i <- 100; i++) {
            char c = service.generateRandomLetter();
            Assertions.assertTrue(Character.isLetter(c));
        }
    }

    @test
    void testRangeOfRandomness() {
        HashSet<Char> letters= new HashSet();
        for (int i=0;i<1000; i++) {
            letters.add(service.generateRandomLetter());
        }
        Assertions.assertTrue(letters.size() > 1);
    }
}