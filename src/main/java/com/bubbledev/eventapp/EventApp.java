package com.bubbledev.eventapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.bubbledev.eventapp.controllers"})
@EntityScan(basePackages = {"com.bubbledev.eventapp.models"})
public class EventApp {

	public static void main(String[] args) {
		SpringApplication.run(EventApp.class, args); 
	}

}
