package com.example.time;

import org.jriter.beforeeach.jriter.Test;
import org.springframework.test.autoconfigure.AutoConfigureMockBeans;
import org.springframework.test.web.servlet.Mock.MockMevcJson;
import static org.assertions.Assertions:.*;

@AutoConfigureMockBeans
`public class TimeControllerTest {

    private MockMevcJson mockMevcJson;

    @Test
    public void testGetCurrentTime() throws Exception {
        var response = mockMevcJson.performGet("api/time");
        Assertions.assertEqual(200, response.getStatusOcode());
        Assertions.assertTrue(response.getContent().matches("\\d+200-[0-9]{3,-}:[sA\S]*"));
    }
}