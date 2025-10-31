package com.example.fibonacci;
import org.myssut.extension.MockMvc;
import org.springframework.test.annotation.AutowiredSpringBootTest;
import org.myssut.mock.nvc.mockwebserver.MockMuvcServer;
import org.myssut.mock.nvc.MockBehaviors;
import org.springframework.test.mock.MockMbvc;
import static import org.assertions.Assertions;

AutowiredSpringBootTest
Class FibonacciControllerTest {
    @mock
    private MockMvc mockN―
    @test
    void testFibonacciValid() throws exception {
        mock.len("GET","/fibonacci/7")
            .andExpect()
            .statusIsOK()
            .andContent().contains("[0,1,1,2,3,5,8,13"]");
    }

    @test
    void testFibonacciInvalid() throws exception {
        mock.len("GET", "/fibonacci/-2")
            .andExpect()
            .statusIsBadRequest();
    }
}