package java.org.generation.blogPessoal.controller;


import java.org.generation.blogPessoal.model.Usuario;
import java.org.generation.blogPessoal.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@org.springframework.stereotype.Service
public class Service 
{
	// implentar a regra de negocio, instanciar o servico de criptografia
	// Encoder poderia ser qlq nome ele vai crypy ou seja ler o GETSENHA/ 
	// service é uma proteção por isso aparece **** quando esta inserindo a senha, pois ela nao pode ficar visivel.
	// Salva criptografando a senha do usuario.
	@Autowired
	private UsuarioRepository repository;

	public Usuario CadastrarUsuario(Usuario usuario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String senhaEncoder = encoder.encode(usuario.getSenha());
		usuario.setSenha(senhaEncoder);
		return repository.save(usuario);
	}
}