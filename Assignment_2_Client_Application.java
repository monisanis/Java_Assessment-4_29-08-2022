package com.example.demo;



import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication

@RestController

public class Assignment_2_Client_Application {



 public static void main(String[] args) {

 SpringApplication.run(Assignment_2_Client_Application.class, args);

 }



 @GetMapping

 public String hi() {

 return "Welcome to second assignment";

 }

}