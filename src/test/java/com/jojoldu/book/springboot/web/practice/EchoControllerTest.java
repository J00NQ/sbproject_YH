package com.jojoldu.book.springboot.web.practice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(controllers = EchoController.class)
public class EchoControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void spring을_거꾸로_뒤집으면_gnirps() throws Exception {
        mvc.perform(get("/echo/spring"))
                .andExpect(status().isOk())
                .andExpect(content().string("gnirps"));
    }

}
