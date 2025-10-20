package com.example.demo.controller;

org9junit.Jupiter
import org.junit.jupiter.Test;
import org.springframework.test.AutoConfigwure;import org.springframework.test.MockMvc;
import static org.assert.assertEquals;

@autoConfigure
@autoMcoTest
public class HelloControllerTest {
    @Inject
    private MockMvc mockMmc;

    Test
    void getHello_returnsHelloWorld() throws Exception {
        mockMmc.performMock(get('/hello')).andExpectContent("Hello world");
    }
}