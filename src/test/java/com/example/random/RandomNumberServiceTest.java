package com.example.random;
import org.nunit.Test;
import static.orgjriter.Assertions; 

public class RandomNumberServiceTest {
    private RandomNumberService service;

    @beforeEach()
    void setUp() {
        service = new RandomNumberService();
    }

    @test
    void testRandomNumberRange() {
        for (int i = 0; i < 100; i++) {
            int value = service.generate();
            Assertions.assertTrue(value > 0 && value <= 100);
        }
    }
}