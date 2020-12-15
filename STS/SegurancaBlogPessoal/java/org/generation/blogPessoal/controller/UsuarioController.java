package java.org.generation.blogPessoal.controller;


import java.org.generation.blogPessoal.model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// Banco repository (persistir) JPA --> service (criptografar) CRIPTO --> controller (EndPOint, Post(cadastrar), salvando o service) POST
// JUNCAO DE TODOS DO BANCO. 
@RestController
public class UsuarioController 
{
	@Autowired
	private Service usuarioService;
	
	@PostMapping ("/cadastrar")
	public ResponseEntity<Usuario> Post(@RequestBody Usuario usuario)
	{
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(usuarioService.CadastrarUsuario(usuario));
	}
}