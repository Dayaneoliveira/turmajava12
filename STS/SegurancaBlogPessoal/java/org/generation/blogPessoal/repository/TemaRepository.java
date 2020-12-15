package java.org.generation.blogPessoal.repository;


import java.org.generation.blogPessoal.model.Tema;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<Tema, Long>
{
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
}