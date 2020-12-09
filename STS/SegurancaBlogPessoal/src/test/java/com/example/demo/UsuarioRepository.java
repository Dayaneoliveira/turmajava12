package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, String>
{
	UsuarioModel findByLogin(String login);
}
