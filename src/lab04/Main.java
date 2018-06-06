/**
* Laboratorio de Programacao 2 - Lab 4
*
* @author Matheus da Silva Coimbra Patriota - 117210391
*/

package lab04;

import java.util.Scanner;

/**
 * Classe Main responsavel por entrada e saida de dados.
 * 
 * @author matheuspatriota
 *
 */
public class Main {
	
	public static Operacoes operacoes = new Operacoes();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String opcao;
		
		do {
			
		System.out.println("(C)adastrar Aluno");

		System.out.println("(E)xibir Aluno");

		System.out.println("(N)ovo Grupo");

		System.out.println("(A)locar Aluno no Grupo e Imprimir Grupos");

		System.out.println("(R)egistrar Aluno que Respondeu");

		System.out.println("(I)mprimir Alunos que Responderam");
		
		System.out.println("(O)ra, vamos fechar o programa!");
		
		System.out.println();
		
		System.out.print("Opcao> ");
		opcao = sc.nextLine();
		
		switch (opcao) {
		
		case "O":
			
			break;
			
		case "C":
			
			System.out.print("Matrícula: ");
			String matricula = sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Curso: ");
			String curso = sc.nextLine();
			operacoes.cadastraAluno(matricula,nome,curso);
			System.out.println();
			break;
			
		case "E":
			
			System.out.print("Matrícula: ");
			matricula = sc.nextLine();
			System.out.println();
			operacoes.consultaAluno(matricula);
			System.out.println();
			break;
			
		case "N":
			
			System.out.print("Grupo: ");
			String nomeDoGrupo = sc.nextLine().toLowerCase();
			System.out.println();
			operacoes.cadastraGrupo(nomeDoGrupo);
			System.out.println();
			break;
			
		case "A":
			
			System.out.print("(A)locar Aluno ou (I)mprimir Grupo? ");
			
			String escolha = sc.nextLine();
			
			if (escolha.equals("A")) {
				
				System.out.print("Matricula: ");
				matricula = sc.nextLine();
				System.out.print("Grupo: ");
				nomeDoGrupo = sc.nextLine().toLowerCase();
				System.out.println();
				operacoes.alocaAlunosEmGrupo(matricula, nomeDoGrupo);
				System.out.println();
			}
			else if (escolha.equals("I")) {
				
				System.out.print("Grupo: ");
				nomeDoGrupo = sc.nextLine();
				System.out.println();
				operacoes.imprimeGrupo(nomeDoGrupo);
				System.out.println();
			}
			else {
				System.out.println("Entrada Invalida!");
			}
		
			break;
		
		case "R":
			
			System.out.print("Matricula: ");
			matricula = sc.nextLine();
			operacoes.cadastraAlunosQueResponderamQuestoesNoQuadro(matricula);
			System.out.println();
			break;
			
		case "I":
			
			System.out.println("Alunos: ");
			operacoes.imprimeAlunosQueResponderamQuestoesNoQuadro();
			System.out.println();
			break;
			
		default:
			System.out.println("OPÇÃO INVALIDA!");
			System.out.println();
			break;
		}
		
		} while (!opcao.equals("O"));
		
	sc.close();
	}
	

}