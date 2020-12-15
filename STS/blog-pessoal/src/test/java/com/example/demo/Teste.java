package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.generation.blogPessoal.Calculadora;
import org.junit.jupiter.api.Test;
public class Teste {

@Test 	
public void Addtest() {
Calculadora junit= new Calculadora();

int result= junit.soma(100, 200);

assertEquals(500, result);
}
}