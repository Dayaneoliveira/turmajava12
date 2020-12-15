package java.org.generation.blogPessoal.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import org.springframework.security.core.GrantedAuthority;


@Entity
public class Role implements GrantedAuthority // Ela confere a permissão de acesso
{
	@Id
	private String nomeRole;
	
	@ManyToMany(mappedBy = "roles")//mapped ele busca informação dentro da role.
	private List<Usuario> usuarios;
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.nomeRole ;
	}
	public String getNomeRole() {
		return nomeRole;
	}
	public void setNomeRole(String nomeRole) {
		this.nomeRole = nomeRole;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}	
}
