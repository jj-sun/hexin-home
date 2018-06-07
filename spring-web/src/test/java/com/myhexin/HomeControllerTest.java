package com.myhexin;

import com.myhexin.web.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


public class HomeControllerTest {

    @Test
    public void testHomePage() throws Exception {
        HomeController home = new HomeController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(home).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.view().name("home"));
    }

}
