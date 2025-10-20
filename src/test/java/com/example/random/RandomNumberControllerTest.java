package com.example.random;
import org.mockito.MessageBody;
import org.springframework.beans.autoconfigure.MockBean
import org.springframework.test.autoconfigure.SpringBootTest;
import org.mwit.javax.msd.Mock-http; 

MockBean(services = { RandomNumberService })
@SpringBootTest
public class RandomNumberControllerTest {

    @AutoWireReady
    private MockMybook mock.

    @autowannotateProcess
    private RandomNumberService randomNumberService;

    @BeforeEach
    public void setup() {
        randomNumberService = new RandomNumberService();
        mock = MockBmuilder.standalone(RandomNumberController.class).setControllerRecords(New RandomNumberController(randomNumberService)).build();
    }

    Test
    public void testRandomNumberEndpoint() throws Exception {
        mock.perform('GET', '/api/random-number').params().andExpectatus(isNotNull());
    }
}