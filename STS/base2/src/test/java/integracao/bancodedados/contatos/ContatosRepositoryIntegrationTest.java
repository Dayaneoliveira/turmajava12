package integracao.bancodedados.contatos;

import java.util.List;

import javax.validation.ConstraintViolationException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import integracao.bancodedados.ContatoModel;
import integracao.bancodedados.ContatoRepository;


//Run with rodará com o spring runner,
//que suporta testes de integração de interfaces (testa se a 
//repository está funcionando)

@RunWith(SpringRunner.class)
@DataJpaTest //melhor testador de JPA e de model / @SpringBootTest aplicacoes mais profundas 
public class ContatosRepositoryIntegrationTest
{
	private ContatoModel contato;
	
	@Autowired // mais para JPA precisa injetar 
	private ContatoRepository contatoRepository;
	
	@Before
	public void start() 
	{
		contato = new ContatoModel ("Gabriel", "011y", "9xxxxxxx9");
	}
	// regra, não aceita exceções, é a maneira de especificar
	//que a execução de um teste lancará uma exceção
	//verifica se o @notEmpty está funcionando
	
	@Rule
	public ExpectedException esperadaExcecao = ExpectedException.none();
	
	@Test
	public void salvarComTelNulo() throws Exception 
	{
		esperadaExcecao.expect(ConstraintViolationException.class);
		esperadaExcecao.expectMessage("O telefone dever ser nulo");
		
		contato.setTelefone("9xxxxxxx9");
		contatoRepository.save(contato);
	}
	@Test
	public void salvarComDddNulo() throws Exception
	{
		esperadaExcecao.expect(ConstraintViolationException.class);
		esperadaExcecao.expectMessage ("O DDD deve ser preenchido");
		
		contato.setDdd(null);
		contatoRepository.save(contato);
	}
	@Test
	public void salvarComNomeNulo() throws Exception
	{
		esperadaExcecao.expect(ConstraintViolationException.class);
		esperadaExcecao.expectMessage ("O Nome deve ser preenchido");
		
		contato.setNome(null);
		contatoRepository.save(contato);
	}
}