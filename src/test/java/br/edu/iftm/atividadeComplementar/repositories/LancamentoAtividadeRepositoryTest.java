package br.edu.iftm.atividadeComplementar.repositories;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.iftm.atividadeComplementar.domains.LancamentoAtividade;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LancamentoAtividadeRepositoryTest {
	
	@Autowired
	private LancamentoAtividadeRepository repository;
	
	@Test
	public void testaLancamentoAtividade01() {
		List<LancamentoAtividade> c = repository.findByCodigoContaining(1);
		assertThat(c.size()).isGreaterThan(0);
	}
	
	public void testaListaVazia() {
		List<LancamentoAtividade> c = repository.findByCodigoContaining(10);
		assertThat(c.size()).isEqualTo(0);
	}

}
