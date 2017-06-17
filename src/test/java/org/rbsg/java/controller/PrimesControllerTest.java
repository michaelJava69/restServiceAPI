package org.rbsg.java.controller;


import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
 
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PrimesController.class) 
//@ContextConfiguration("/springrest-servlet.xml")
 


@WebAppConfiguration
public class PrimesControllerTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc ;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    	
    }

    @Test
    public void canFetchPrimeNumbers() throws Exception {
        // Given
        final int upperLimit = 10;

        System.out.println(" canFetchPrimeNumbers == "  + mockMvc);
        
        
        // When
        this.mockMvc
        
        		//  .perform(get("/primes/" + upperLimit) )
                //   .perform(get("/primes/" + upperLimit).accept(MediaType.APPLICATION_JSON))
                  
                    .perform(get("/primes/" + upperLimit+".json").accept(MediaType.APPLICATION_JSON))
        // Then
                  .andExpect(status().isOk())
              //  .andExpect(content().contentType("application/json;charset=UTF-8"))
              //  .andExpect(jsonPath("$.initial", is(10)))
              //  .andExpect(jsonPath("$.primes", contains(2, 3, 5, 7)))
        ;
        System.out.println(" canFetchPrimeNumbers == "  + mockMvc);
    }

}