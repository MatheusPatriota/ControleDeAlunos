package lab04;

import java.util.ArrayList;
import java.util.HashMap;

public class Operacoes {
	
	private ArrayList<Aluno> alunos = new ArrayList<>();
	private Grupo grupo = new Grupo(null, null);
	private HashMap<String, Aluno> mapaMatriculaAlunos = new HashMap<>();
	private HashMap<String, Grupo> grupoParaAlunos = new HashMap<>();
	private ArrayList<Aluno> alunosQueResponderamQuestaoNoQuadro = new ArrayList<>();
	
	/**
	 * contrutor operacoes para inicializar a classe
	 */
	public Operacoes() {
		
	}
	
	/**
	 * metodo usado para cadastrar novo aluno que possui, matricula, nome e curso
	 * metodo ainda retorna true para cadastrado e false para tentativa falha.
	 * 
	 * @param matricula
	 * @param nome
	 * @param curso
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
			this.mapaMatriculaAlunos.put(matricula, aluno);
			System.out.println("CADASTRO REALIZADO!");
			System.out.println();
			return true;
			
		}
		
	}
	
	/**
	 * metodo usado para consultar Aluno a partir de sua matricula.
	 * 
	 * @param matricula
	 */
	public String consultaAluno(String matricula) {
		
		if (this.mapaMatriculaAlunos.containsKey(matricula) == true) {
			
			return("Aluno: " + mapaMatriculaAlunos.get(matricula));
		}
		else {
			
			return("Aluno não cadastrado.");
		}
		
		
		
		
		}
	/**
	 * Metodo utilizado para cadastras grupos, sendo passado como parametro
	 * apenas o nome do grupo, retornando true para cadastrado com sucesso 
	 * ou false para grupo ja cadastrado.
	 * 
	 * @param nomeDoGrupo
	 * @return
	 */
	public boolean cadastraGrupo(String nomeDoGrupo) {
		if (this.grupoParaAlunos.containsKey(nomeDoGrupo)) {
			
			System.out.println("GRUPO JÁ CADASTRADO!");
			return false;
			
		}
		else {
			
			this.grupo = new Grupo(nomeDoGrupo, alunos);
			this.grupoParaAlunos.put(nomeDoGrupo, grupo);
			System.out.println("CADASTRO REALIZADO!");
			System.out.println();
			return true;
			
		}
		
		
	}
	/**
	 * Metodo utilizado para alocar um aluno em um grupo especifico, sendo passado
	 * como parametro a matricula e o nome do grupo, retornando true para alocado
	 * e false para algum parametro invalido.
	 * 
	 * @param matricula
	 * @param nomeDoGrupo
	 * @return
	 */
	public boolean alocaAlunosEmGrupo(String matricula, String nomeDoGrupo) {
		
		if (this.mapaMatriculaAlunos.containsKey(matricula) == true) {
			
			if (this.grupoParaAlunos.containsKey(nomeDoGrupo) == true) {
				
				if (this.alunos.contains(this.mapaMatriculaAlunos.get(matricula))) {
					
					System.out.println("ALUNO ALOCADO!");
					return true;
				}
				else {
					
					grupo.setAlunos(this.mapaMatriculaAlunos.get(matricula));
					System.out.println("ALUNO ALOCADO!");
					return true;
				}
			}
			else {
				
				System.out.println("Grupo não cadastrado.");
				return false;
			}
		}
		else {
			
			System.out.println("Aluno não cadastrado.");
			return false;
		}

	}
	
	/**
	 * Metodo responsavel por imprimir todos os alunos que estao
	 * contidos no grupo, sendo passado como parametro apenas o nome
	 * do grupo.
	 * 
	 * @param nomeDoGrupo
	 */
	public void imprimeGrupo(String nomeDoGrupo) {
		if (this.grupoParaAlunos.containsKey(nomeDoGrupo)) {
			
			System.out.println(grupo.toString());
		}
		else {
			
			System.out.println("Grupo não cadastrado.");
		}
		
		
	}
	/**
	 * Metodo responsavel por cadastrar alunos que responderam questoes no quadro,
	 * sendo passado como parametro apenas a matricula do aluno.
	 * 
	 * @param matricula
	 */
	public void cadastraAlunosQueResponderamQuestoesNoQuadro(String matricula) {
		
		if (this.mapaMatriculaAlunos.containsKey(matricula)) {
			
			alunosQueResponderamQuestaoNoQuadro.add(this.mapaMatriculaAlunos.get(matricula));
			System.out.println("ALUNO REGISTRADO!");
		}
		else {
			
			System.out.println("Aluno não cadastrado.");
		}
		
		
	}
	/**
	 * Metodo responsavel apenas por imprimir todos os alunos que fizeram questoes no 
	 * quadro, esse metodo nao recebe parametros.
	 * 
	 */
	public void imprimeAlunosQueResponderamQuestoesNoQuadro() {
		System.out.println();
		String resultadoDoArray = "";
		for (int i = 0; i < alunosQueResponderamQuestaoNoQuadro.size(); i++) {
			resultadoDoArray += (i+1 +". " +alunosQueResponderamQuestaoNoQuadro.get(i) + System.lineSeparator()); 
		}
		System.out.println(resultadoDoArray);
	}
	
}