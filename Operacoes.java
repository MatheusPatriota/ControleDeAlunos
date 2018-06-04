package lab04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;



public class Operacoes {
	
	Scanner sc = new Scanner(System.in);
	private HashMap<String, Aluno> mapaMatriculaAlunos = new HashMap<>();
	private HashMap<String, Aluno> grupoParaAlunos = new HashMap<>();
	
	/**
	 * contrutor operacoes para inicializar a classe
	 */
	public Operacoes() {
		
	}
	/**
	 * metodo usado para cadastrar novo aluno que possui, matricula, nome e curso
	 * metodo ainda retorna true para cadastrado e false para tentativa falha
	 * @return
	 */
	public boolean cadastraAluno(String matricula, String nome, String curso) {
		
		Aluno aluno;
		if (this.mapaMatriculaAlunos.containsKey(matricula) == true) {
			System.out.println("MATRÍCULA JÁ CADASTRADA!");
			System.out.println();
			return false;
		}
		else {
			
			aluno = new Aluno(matricula, nome, curso);
			System.out.println("CADASTRO REALIZADO!");
			System.out.println();
			this.mapaMatriculaAlunos.put(matricula, aluno);
			return true;
			
		}
		
	}
	/**
	 *  metodo usado para consultar Aluno a partir de sua matricula
	 */
	public void consultaAluno(String matricula) {
		
		if (this.mapaMatriculaAlunos.containsKey(matricula) == true) {
			System.out.println(mapaMatriculaAlunos.get(matricula));
		}
		else {
			System.out.println("Aluno não cadastrado.");
		}
		System.out.println();
		
		
		}
	
	public void cadastraGrupo(String nomeDoGrupo) {
		
		
		this.grupoParaAlunos.put(nomeDoGrupo, null);
		System.out.println("CADASTRO REALIZADO!");
		System.out.println();
		
	}
	
	public void alocaAlunosEmGrupo(String matricula, String nomeDoGrupo) {
		
		if (this.mapaMatriculaAlunos.containsKey(matricula) == true) {
			if (this.grupoParaAlunos.containsKey(nomeDoGrupo) == true) {
				
			}
			else {
				System.out.println("Grupo não cadastrado.");
			}
			
		}
		else {
			System.out.println("Aluno não cadastrado.");
		}
		

	}
}
