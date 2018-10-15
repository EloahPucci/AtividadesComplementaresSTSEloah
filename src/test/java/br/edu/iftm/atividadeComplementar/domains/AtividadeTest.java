package br.edu.iftm.atividadeComplementar.domains;

import org.junit.Before;
import org.junit.Test;

import br.edu.iftm.atividadeComplementar.domains.Atividade;

import org.junit.Assert;

public class AtividadeTest {
	
	private Atividade atividade;
	
	@Before
	public void init() {
		atividade = new Atividade();
	}
	
	@Test
	public void testaQuantidadeLimiteHoras() {
		int percentualMonitoria = 50;
		int quantidadeHorasSistemasParaInternet = 60;
		atividade.setNome("Monitoria");
		atividade.setMaximoAtividadesSemestre(1);
		atividade.setPercentualPorAtividade(percentualMonitoria);
		int quantidadeHoras = atividade.getValorLimiteHorasAtividade(quantidadeHorasSistemasParaInternet);
		Assert.assertEquals(quantidadeHoras,30);
	}
	
	@Test
	public void testaDisciplinasExtraCurriculares() {
		int percentualCurso = 40;
		int quantidadeHoras = 200;
		atividade.setNome("Cursos e Minicursos");
		atividade.setMaximoAtividadesSemestre(1);
		atividade.setPercentualPorAtividade(percentualCurso);
		int qtdHoras = atividade.getValorLimiteHorasAtividade(quantidadeHoras);
		Assert.assertEquals(qtdHoras,80);
	}
	
	@Test
	public void testaParticipacaoColegiadosConselhos() {
		int percentualCurso = 10;
		int quantidadeHoras = 100;
		atividade.setNome("Participação em Colegiados/Conselhos");
		atividade.setMaximoAtividadesSemestre(1);
		atividade.setPercentualPorAtividade(percentualCurso);
		int qtdHoras = atividade.getValorLimiteHorasAtividade(quantidadeHoras);
		Assert.assertEquals(qtdHoras,10);
	}
	
	@Test
	public void testaIntegranteGrupoEstudo() {
		int percentualCurso = 20;
		int quantidadeHoras = 10;
		atividade.setNome("Integrante de Núcleo ou Grupo de Estudo");
		atividade.setMaximoAtividadesSemestre(3);
		atividade.setPercentualPorAtividade(percentualCurso);
		int qtdHoras = atividade.getValorLimiteHorasAtividade(quantidadeHoras);
		Assert.assertEquals(qtdHoras,6);
	}
	
	@Test
	public void testaQuantidadeLimiteHorasLicenciatura() {
		int percentualCurso = 40;
		int quantidadeHorasLicenciatura = 200;
		atividade.setNome("Cursos e Minicursos");
		atividade.setMaximoAtividadesSemestre(2);
		atividade.setPercentualPorAtividade(percentualCurso);
		int quantidadeHoras = atividade.getValorLimiteHorasAtividade(quantidadeHorasLicenciatura);
		Assert.assertEquals(quantidadeHoras,80);
	}

}



