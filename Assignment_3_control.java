package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class Assignment_3_control {
	 @RequestMapping(value = "/docker", method = RequestMethod.GET)
public String sayHi()
{
	return " Welcome to Docker";
}
}
