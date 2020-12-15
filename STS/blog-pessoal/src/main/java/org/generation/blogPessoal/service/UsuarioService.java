package org.generation.blogPessoal.service;

import java.nio.charset.Charset;
import org.apache.commons.codec.binary.Base64;
import java.util.Optional;

import org.generation.blogPessoal.model.UserLogin;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service // classe trata-se de um servico
public class UsuarioService 
{
	@Autowired // uma injeção do Usuario
	private UsuarioRepository repository;
	
	//metodo receber um usuario e returna um usuario
	public Usuario CadastrarUsuario (Usuario usuario) 
	{
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); //instanciar um obejto nome dele é enconder
		
		String senhaEnconder = encoder.encode(usuario.getSenha()); //receber o usuario o encoder 
		usuario.setSenha(senhaEnconder); // senha que entra aqui vai esta criptada
		
		return repository.save(usuario); // salvar os objetos usuario ja com a senha modificada, e ela já entrara criptada
	}
	// metodo tudo que se refere a logar
	public Optional<UserLogin> Logar(Optional <UserLogin> user)
	{
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); //instanciar um obejto nome dele é enconder
	Optional<Usuario> usuario = repository.findByUsuario(user.get().getUsuario());// receber o findByusuario que esta no repositorio 
		
	if(usuario.isPresent()) //se tiver alguma coisa dele comparar a senha criptada com a senha que o usuario digitou 
	{
		if (encoder.matches(user.get().getSenha(), usuario.get().getSenha()))//primeiro pega a senha do banco de dados que recebeu do cliente// pegando essas duas senhas separa comparadas se estiver verdadeira entra dentro desse IF
		{
			String auth = user.get().getUsuario() + ":" + user.get().getSenha(); // concatenar duas informacoes o usuario e a senha com dois : entre elas 
			byte[] encodeAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));// ele vai pegar o encode ele vai receber o formato de qual byte ele quer 
			
			String authHeader = "Basic " + new String(encodeAuth); //autenticar o authHeader ou seja concatenar 
			//preenchendo o token
			user.get().setToken(authHeader);
			
			//acessar por meio do set
			user.get().setNome(usuario.get().getName());
			
			//retornando o user
			return user;
		}
		
	}
	// o sistema entenderá que não existe esse usuario no banco de dados.
	return null;
	}
}