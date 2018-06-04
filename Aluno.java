package lab04;

public class Aluno {
	
	private String nome;
	private String matricula;
	private String curso;
	
	/**
	 * Contrutor de Aluno responsavel por inicializar sua classe e atributos
	 * @param matricula
	 * @param nome
	 * @param curso
	 */
	public Aluno(String matricula, String nome, String curso) {
		
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public String getCurso() {
		return curso;
	}
	
	@Override
	public String toString() {
		
		return "Aluno: " + matricula + " - " + nome + " - " + curso;
	}
}
