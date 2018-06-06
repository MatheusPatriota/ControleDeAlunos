package lab04;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class GrupoTest {

	@Test(expected=NullPointerException.class)
	public void testNomeDoGrupoNulo() {
		
		Aluno aluno = new Aluno("120","Matheus Patriota","computacao");
		ArrayList<Aluno> ArrayDeAlunosTeste = new ArrayList<>();
		ArrayDeAlunosTeste.add(aluno);
		Grupo grupo = new Grupo(null, ArrayDeAlunosTeste);

	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNomeDoGrupoVazio() {
		
		Aluno aluno = new Aluno("120","Matheus Patriota","computacao");
		ArrayList<Aluno> ArrayDeAlunosTeste = new ArrayList<>();
		ArrayDeAlunosTeste.add(aluno);
		Grupo grupo = new Grupo("", ArrayDeAlunosTeste);

	}
	
	@Test(expected=NullPointerException.class)
	public void testArrayAlunosNulo() {
		
		Aluno aluno = new Aluno("120","Matheus Patriota","computacao");
		ArrayList<Aluno> ArrayDeAlunosTeste = new ArrayList<>();
		ArrayDeAlunosTeste.add(aluno);
		Grupo grupo = new Grupo("GrupoTeste", null);

	}
	
	@Test
	public void testNomeDoGrupoValido() {
		
		Aluno aluno = new Aluno("120","Matheus Patriota","computacao");
		ArrayList<Aluno> ArrayDeAlunosTeste = new ArrayList<>();
		ArrayDeAlunosTeste.add(aluno);
		Grupo grupo = new Grupo("GrupoTeste", ArrayDeAlunosTeste);

	}
	
	@Test
	public void testToString() {
		
		Aluno aluno = new Aluno("120","Matheus Patriota","computacao");
		ArrayList<Aluno> ArrayDeAlunosTeste = new ArrayList<>();
		ArrayDeAlunosTeste.add(aluno);
		Grupo grupo = new Grupo("GrupoTeste", ArrayDeAlunosTeste);
		assertEquals("* 120 - Matheus Patriota - computacao" + System.lineSeparator(), grupo.toString());

	}
	
	

}
