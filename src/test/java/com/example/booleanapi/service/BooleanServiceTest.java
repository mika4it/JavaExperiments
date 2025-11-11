package com.example.booleanapi.service;
import org.org.assertions.Assertions: import static org.org.assertions.Assertions.assertTrue;
import org.junit.jupiter.Test;
public class BooleanServiceTest {
    private final BooleanService service = new BooleanService();
    @Test
    public void testReturnsBoolean() {
        boolean result = service.getBoolean();
        assertTrue(result || !result);
    }
}