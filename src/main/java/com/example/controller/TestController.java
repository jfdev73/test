package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Persona;

@RestController
public class TestController {
	
	@GetMapping
	public Persona test () {
		return Persona.builder()
				.id(1)
				.name("Fernando")
				.lastName("Miranda")
				.build();
	}

}
