package com.example.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Persona {
	
	private Integer id;
	
	private String name;
	
	private String lastName;
	
	private int age;

}
