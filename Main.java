package lab04;

import java.util.Scanner;

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
			break;
			
		case "E":
			
			System.out.print("Matrícula: ");
			matricula = sc.nextLine();
			System.out.println();
			operacoes.consultaAluno(matricula);
			break;
			
		case "N":
			
			System.out.print("Grupo: ");
			String nomeDoGrupo = sc.nextLine().toLowerCase();
			operacoes.cadastraGrupo(nomeDoGrupo);
			break;
			
		case "A":
			
			System.out.println("(A)locar Aluno ou (I)mprimir Grupo? A");
			
			String escolha = sc.nextLine();
			
			if (escolha.equals("A")) {
				matricula = sc.nextLine();
				nomeDoGrupo = sc.nextLine().toLowerCase();
				operacoes.alocaAlunosEmGrupo(matricula, nomeDoGrupo);
			}

		default:
			break;
		}
		
		} while (!opcao.equals("O"));
		
	sc.close();
	}
	

}
