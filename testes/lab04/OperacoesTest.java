package lab04;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperacoesTest {

	@Test
	public void testCadastraAlunoValido() {
		
		Operacoes operacao = new Operacoes();
		operacao.cadastraAluno("120","Matheus Patriota","computacao");
		assert(operacao.consultaAluno("120") == true);
		
	}
	
	@Test
	public void testConsultaAlunoValido() {
		
		Operacoes operacao = new Operacoes();
		operacao.cadastraAluno("120","Matheus Patriota","computacao");
		assertEquals(true, operacao.consultaAluno("120"));
		
	}
	
	@Test
	public void testCadastraGrupoValido() {
		
		Operacoes operacao = new Operacoes();
		operacao.cadastraGrupo("GrupoTeste");
		assert(operacao.imprimeGrupo("GrupoTeste") == true);
		
	}
	
	@Test
	public void testAlocaAlunosEmGrupoValido() {
		
		Operacoes operacao = new Operacoes();
		operacao.cadastraAluno("120","Matheus Patriota","computacao");
		operacao.cadastraGrupo("GrupoTeste");
		assert(operacao.alocaAlunosEmGrupo("120", "GrupoTeste") == true);
		
	}
	
	@Test
	public void testAImprimeGrupoValido() {
		
		Operacoes operacao = new Operacoes();
		operacao.cadastraAluno("120","Matheus Patriota","computacao");
		operacao.cadastraGrupo("GrupoTeste");
		assert(operacao.imprimeGrupo("GrupoTeste") == true);
		
	}
	
	@Test
	public void testCadastraAlunoQueRespondeuQuestoesNoQuadroValido() {
		
		Operacoes operacao = new Operacoes();
		operacao.cadastraAluno("120","Matheus Patriota","computacao");
		assert(operacao.cadastraAlunosQueResponderamQuestoesNoQuadro("120") == true);
		
	}
	
	@Test
	public void testImprimeAlunoQueRespondeuQuestoesNoQuadroValido() {
		
		Operacoes operacao = new Operacoes();
		operacao.cadastraAluno("120","Matheus Patriota","computacao");
		operacao.cadastraAlunosQueResponderamQuestoesNoQuadro("120");
		String esperado = "1. 120 - Matheus Patriota - computacao" + System.lineSeparator();
		assertEquals(esperado, operacao.imprimeAlunosQueResponderamQuestoesNoQuadro());
		
	}
	
	@Test(expected=NullPointerException.class)
	public void testCadastraAlunoInvalido() {
		
		Operacoes operacao = new Operacoes();
		operacao.cadastraAluno(null,"Matheus Patriota","computacao");
		assert(operacao.consultaAluno("120") == false);
		
	}
	
	@Test
	public void testConsultaAlunoInvalido() {
		
		Operacoes operacao = new Operacoes();
		operacao.cadastraAluno("120","Matheus Patriota","computacao");
		assert(operacao.consultaAluno("130") == false);
		
	}
	
	@Test
	public void testAlocaAlunoEmGrupoComMatriculaInvalida() {
		
		Operacoes operacao = new Operacoes();
		operacao.cadastraAluno("120","Matheus Patriota","computacao");
		operacao.cadastraGrupo("GrupoTeste");
		assert(operacao.alocaAlunosEmGrupo(null, "GrupoTeste") == false);
		
	}
	
	@Test
	public void testAlocaAlunoEmGrupoComNomeDoGrupoInvalido() {
		
		Operacoes operacao = new Operacoes();
		operacao.cadastraAluno("120","Matheus Patriota","computacao");
		operacao.cadastraGrupo("GrupoTeste");
		assert(operacao.alocaAlunosEmGrupo("120", null) == false);
		
	}
	
	@Test
	public void testAImprimeGrupoInvalido() {
		
		Operacoes operacao = new Operacoes();
		operacao.cadastraAluno("120","Matheus Patriota","computacao");
		operacao.cadastraGrupo("GrupoTeste");
		assert(operacao.imprimeGrupo(null) == false);
		
	}
	
	@Test
	public void testCadastraAlunoQueRespondeuQuestoesNoQuadroInvalido() {
		
		Operacoes operacao = new Operacoes();
		operacao.cadastraAluno("120","Matheus Patriota","computacao");
		assert(operacao.cadastraAlunosQueResponderamQuestoesNoQuadro("650") == false);
		
	}
	
}