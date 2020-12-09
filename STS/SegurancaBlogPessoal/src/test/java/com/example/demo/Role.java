package com.example.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;
@Entity
public class Role implements GrantedAuthority
{
	@Id 
	private String nomeRole;
	
	@ManyToMany (mappedBy = "Roles"  )
	private List<UsuarioModel> usuarios;

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return null;
	}
}
