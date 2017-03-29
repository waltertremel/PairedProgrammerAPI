package com.programmers.practice.contracts;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import com.programmers.practice.PairedProgrammersApplication;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by xpdesktop on 3/27/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PairedProgrammersApplication.class , webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class ProgrammerEndpointBase {

    @Autowired
    private WebApplicationContext context;

    @Before
    public void setup(){
        MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
        RestAssuredMockMvc.mockMvc(mockMvc);
    }

}
