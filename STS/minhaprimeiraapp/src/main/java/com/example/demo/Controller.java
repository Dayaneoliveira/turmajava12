package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
	@GetMapping ("/get")
	public String hello () 
	{
		return "MENTALIDADES E HABILIDADES !!!\n Metodos utilizados, Persistencia e Atencao aos detalhes.";
	}
	
}

