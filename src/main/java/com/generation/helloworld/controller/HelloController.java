package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String helloWord() {
		return "Hello World Giovanna! ";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "A BSM da Generation incluem:  <br />  As Mentalidade  <br />  Orientação ao futuro   <br />  Responsabilidade Pessoal  <br /> Mentalidade de Crescimento  <br /> Persistência    <br /> As Habilidades:    <br />   Trabalho em Equipe  <br />  Orientação ao Detalhe  <br /> Proatividade  <br /> Comunicação! ";
	
	}
	@GetMapping("/objetivo")
	public String objetivo() {
		return "Meu objetivo para essa semana é entender o que está sendo proposto e praticar, entregar os exercícios no prazo, somar no projeto integrador agregando informações e opniões que podem ajudar, participar de todas as aulas e respeitar o meu tempo....! ";
	
	}
}
