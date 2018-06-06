package lab04;

import static org.junit.Assert.*;

import org.junit.Test;


public class AlunoTest {
	
	private Aluno alunoBasico;
	
	@Test(expected=NullPointerException.class)
	public void testNomeNulo() {
		
		alunoBasico = new Aluno("120",null,"computacao");
	}
	
	@Test(expected=NullPointerException.class)
	public void testMatriculaNula() {
		
		alunoBasico = new Aluno(null,"Matheus Patriota","computacao");
	}
	
	@Test(expected=NullPointerException.class)
	public void testCursoaNulo() {
		
		alunoBasico = new Aluno("120","Matheus Patriota",null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMatriculaVazia() {
		
		alunoBasico = new Aluno("","Matheus Patriota","computacao");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNomeVazio() {
		
		alunoBasico = new Aluno("120","","computacao");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testCursoVazio() {
		
		alunoBasico = new Aluno("120","Matheus Patriota","");
	}
	
	@Test
	public void testToString() {
		String msg = "Esperando obter aluno";
		alunoBasico = new Aluno("120","Matheus Patriota","computacao");
		assertEquals(msg,"120 - Matheus Patriota - computacao", alunoBasico.toString());
	}
	

}
