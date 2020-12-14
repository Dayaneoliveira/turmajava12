package org.generation.blogPessoal.controller;

import java.util.Optional;

import org.generation.blogPessoal.model.UserLogin;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // essa é uma classe de controle 
@RequestMapping ("/usuarios") // vamos acessar o usuario atraves desse caminho
@CrossOrigin (origins = "*", allowedHeaders= "*") // vamos aceitar qlq informação
public class UsuarioController
{
	@Autowired 
	private UsuarioService usuarioService;
	
	@PostMapping ("/logar") //chamando o metodo de logar, o usuario nao tera acesso as informacoes de cadastro,para mais seguranca 
	public ResponseEntity<UserLogin>Autentication(@RequestBody Optional<UserLogin> user)
	{
		return usuarioService.Logar(user).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());	
	}
	@PostMapping("/cadastrar")//chamando o metodo de cadastrar, 
	public ResponseEntity<Usuario>post(@RequestBody Usuario usuario)
	{
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(usuarioService.CadastrarUsuario(usuario));
	}
}
