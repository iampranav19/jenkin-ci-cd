package com.pranav;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(TestController.class) // Only loads TestController
public class TestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGreetingEndpoint() throws Exception {
        mockMvc.perform(get("/greet"))
               .andExpect(status().isOk())
               .andExpect(content().string("This is the greeting message"));
    }
}
