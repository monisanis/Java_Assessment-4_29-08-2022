package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class Test extends Assignment_3_ApplicationTests {

 @Autowired

 private WebApplicationContext webApplicationContext;

 private MockMvc mockMvc;

 @Before

 public void setup() {

 mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

 }
 @org.junit.jupiter.api.Test

 public void test() throws Exception {
	 mockMvc.perform(get("/docker")).andExpect(status().isOk())

	  .andExpect(content().contentType("application/json;charset=UTF-8"))

	  .andExpect(jsonPath("$.name").value("emp1")).andExpect(jsonPath("$.designation").value("manager"))

	  .andExpect(jsonPath("$.empId").value("1")).andExpect(jsonPath("$.salary").value(3000));

	 }
}