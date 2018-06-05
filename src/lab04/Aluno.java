package lab04;

public class Aluno {
	
	private String nome;
	private String matricula;
	private String curso;
	
	/**
	 * Contrutor de Aluno responsavel por inicializar sua classe e atributos.
	 * 
	 * @param matricula
	 * @param nome
	 * @param curso
	 */
	public Aluno(String matricula, String nome, String curso) {
		
		if (matricula == null) {
			throw new NullPointerException("matricula nula!");
		}
		if (nome == null) {
			throw new NullPointerException("nome nulo!");
		}
		if (curso == null) {
			throw new NullPointerException("curso nulo!");
		}
		if (matricula.equals("")) {
			throw new IllegalArgumentException("matricula vazio!");
		}
		if (nome.equals("")) {
			throw new IllegalArgumentException("nome vazio!");
		}
		if (curso.equals("")) {
			throw new IllegalArgumentException("curso vazio!");
		}
		
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
	
	/**
	 * toString para padrozinar a exibicao da classe Aluno, usando sua matricula, nome e curso.
	 * @return
	 */
	@Override
	public String toString() {
		
		return  matricula + " - " + nome + " - " + curso;
	}

	/**
	 * hashcode utilizado para que nao se tenha 2 alunos com a mesma matricula.
	 * 
	 * @return
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	/**
	 * equals utilizado para checar se os objetos distinguem um do outro.
	 * 
	 * @return
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}
}
