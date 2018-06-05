package lab04;

import java.util.ArrayList;

/**
 * Classe Grupo responsavel por amazenar o nome do grupo e um ArrayList do tipo Aluno.
 * @author matheuspatriota
 *
 */
public class Grupo {
	
	private String nome;
	private ArrayList<Aluno> alunos;
	
	/**
	 * Construtor da classe Grupo para iniciar os atributos criados.
	 * @param nome
	 * @param alunos
	 */
	public Grupo(String nome, ArrayList<Aluno> alunos) {
		
		this.nome = nome;
		this.alunos = alunos;
		
	}

	public void setAlunos(Aluno alunos) {
		
		this.alunos.add(alunos);
	}
	
	public String getNome() {
		return nome;
	}
	
	/**
	 * toString da classe Grupo para padronizar a exibicao dos alunos que estao
	 * dentro do grupo.
	 * @return
	 */
	@Override
	public String toString() {
		String resultadoDoToString = "";
		System.out.println("Alunos do grupo " + nome +": ");
		for (int i = 0; i < alunos.size(); i++) {
			resultadoDoToString += ("*" + " " + alunos.get(i) + System.lineSeparator());
		}
		return resultadoDoToString;
	}
	
	/**
	 * hashcode responsavel por tornar o nome do grupo a chave de indentificacao da classe.
	 * @return
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	
	/**
	 * equals utilizado para checar se os objetos distinguem um do outro
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
		Grupo other = (Grupo) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
