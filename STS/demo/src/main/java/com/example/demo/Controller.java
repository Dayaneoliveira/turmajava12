package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//é uma api rest que será consumida pelo front
//WebMvcConfigurer é que faz o roteamento
@RestController
@RequestMapping("/pagina") // esta é uma notação para o Angular fazer leitura
public class Controller implements WebMvcConfigurer {

	// quando o usuario digitar localhost:8080 o sistema le como localhost:8080/
	public void addViewControllers(ViewControllerRegistry index) {
		index.addViewController("/").setViewName("forward:/index.html");
	}

	// ele vai conectar com a tabela manutencao, ou seja, qdo vamos fazer o
	// controler, precisamos
	// injetar o caminhao que vai levar os dados ate a tabela
	// @autowired injecao e repository é o caminhao que leva os dados na tabela
	@Autowired
	private ManutencaoRepository repository;
	private Object resp;

	// post inserir
	@PostMapping("/post1")
	public ManutencaoTable criar(@RequestBody ManutencaoTable objetinho) // metodo e o requestBody
	{
		repository.save(objetinho);// salvar na tabela
		return objetinho; // retornar objeto
	}

	// este metodo criar vai salvar as informacoes la no banco
	// insert ---------localhost:8080/pagina/manutencoes
	@PostMapping("/post2") // metodo com Response
	public ResponseEntity<ManutencaoTable> post(@RequestBody ManutencaoTable objeto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(objeto));// retorna cria e salva
	}
	// Find All
	// Save
	// FindByid
	// deleteByid
	// insert into tb_manutencao "OQUE A PESSOA DIGITAR NO BODY"

	// getAll select *
	// from------------------------------------------------------------------------------------------
	@GetMapping("/getAll1")
	public List<ManutencaoTable> pesquisarTodos() {
		return repository.findAll();
	}

	@GetMapping("/getAll2")
	public ResponseEntity<List<ManutencaoTable>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	// LOCALHOST:8080/pagina/getById1/1
	// gets by id select where
	// id-----------------------------------------------------------------------------------
	@GetMapping("/getById1/{id}")
	public Optional<ManutencaoTable> encontrarUm(@PathVariable Long id) {
		return repository.findById(id);

	}

	// LOCALHOST:8080/pagina/getById2/1
	@GetMapping("/getById2/{id}")
	public ResponseEntity<ManutencaoTable> GetById(@PathVariable Long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	// updates
	@PutMapping("/put1/{id}")
	public ManutencaoTable atualizar(@PathVariable Long id, @RequestBody ManutencaoTable objetinho) {
		objetinho.setId(id);
		repository.save(objetinho);
		return objetinho;
	}

	@PutMapping("/put2")
	public ResponseEntity<ManutencaoTable> put(@RequestBody ManutencaoTable postagem) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	}
	//deletes--------------------------------
	@DeleteMapping ("/delete/{id}")
	public String remover (@PathVariable Long id) 
	{
	try
		
	{repository.deleteById(id);
		return "sucesso";
	}catch(Exception e) 
			{
			return "ERRO: " + e.getMessage();
			}
		
	}
}
// SELECT * FROM TB_MANUTENCAO WHERE id={id}
//path variable serve para passar parametro 
//@requestbody requerer algo digitado no corpo 