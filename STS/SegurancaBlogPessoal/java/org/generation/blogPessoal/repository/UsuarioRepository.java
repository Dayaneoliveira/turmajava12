package java.org.generation.blogPessoal.repository;

import java.org.generation.blogPessoal.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> //Herdando uma funcao da jpa, extenção dessa herança
{
	
	Usuario findByLogin(String login); // Puxa informações de cada usuario. **** 
}
