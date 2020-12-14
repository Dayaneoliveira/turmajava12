package org.generation.blogPessoal.seguranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class BasicSecurityConfig extends WebSecurityConfigurerAdapter

{
	@Autowired //injeção de indepencia
	private UserDetailsService userDetailsService;  // injentar de uma classe que ja existe UserDetailsSERVICE
	
	@Override // subcrista de metodo 
	protected void configure(AuthenticationManagerBuilder auth) throws Exception // nomear como auth (pronuncia alf)----thrwos tratativa de erros
	{
		auth.userDetailsService(userDetailsService);  //chamr o alf o metodo 
	}
	@Bean 
	public PasswordEncoder passwordEncoder() 
	{
		return new BCryptPasswordEncoder(); 
	}
	@Override 
	protected void configure(HttpSecurity http) throws Exception 
	{
		http.authorizeRequests()
		.antMatchers("/usuarios/logar").permitAll() //liberar alguns caminhos dentro do controle para o cliente ter alguns acessos
		.antMatchers("/usuarios/cadastrar").permitAll() //requicoes dentro da API
		.anyRequest().authenticated()// todas as contas de acesso deveram estar autenticadas 
		.and().httpBasic() // utilizar o padrao para gerar a chave token
		.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) // qual tipo de seção que será usada// STATELESS não guardar seção
		.and().cors()//HABILITAR O CORs
		.and().csrf().disable();// CSRF, desabilitar todas as configuraçoes personalizadas, para usar as padroes
	}
	
}
