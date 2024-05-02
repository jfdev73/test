package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.example.model.Persona;
import com.example.repository.PersonaRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PersonaService {
	
	private final PersonaRepository personaRepository;
	
	public List<Persona> getAll(){
		return personaRepository.getAll();
	}

}
