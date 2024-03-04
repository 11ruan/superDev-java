package br.com.helloWorld;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainList {

	public static void main(String[] args) {

		// Estrutura de dados LIST

		List<String> listaAlunos = new ArrayList<String>();

		Scanner scan = new Scanner(System.in);

		int decicao = -1;

		while (decicao != 0) {

			System.out.println("[1] Exibit Lista \n");
			System.out.println("[2] Novo Aluno \n");
			System.out.println("[3] Remover Aluno \n");
			System.out.println("[4] Alterar Lista \n");
			System.out.println("[0] Sair \n");

			decicao = scan.nextInt();

			switch (decicao) {
			case 1:
				System.out.println("Quantidade de alunos: " + listaAlunos.size());
				break;
			case 2:
				System.out.println("Digite o nome do novo Aluno: \n");
				String novoAluno;
				novoAluno = scan.next();
				listaAlunos.add(novoAluno);
				break;
			case 3:
				System.out.println("Digite o nome de quem deseja remover: \n");
				String remoAluno = scan.next();
				int indexRemocao = listaAlunos.indexOf(remoAluno);
				if (indexRemocao >= 0) {
					listaAlunos.remove(indexRemocao);
				}
				break;
			default:
				break;
			}

			System.out.println(listaAlunos);

		}

//			System.out.println("Imprimir todos os alunos através de um 'FOR': \n");
//			for (int i = 0; i < listaAlunos.size(); i++) {
//				System.out.println(listaAlunos.get(i));
//			}

//			System.out.println("Imprimir todos os alunos através de um 'FOR..FO': \n");
//			for(String aluno: listaAlunos) {
//				System.out.println(aluno);
//			}
//			
//			//REMOVER ELEMENTO DA LISTA
//			
//			
//			System.out.println("Lista de Aluno Atualizada: \n");
//			for(String aluno: listaAlunos) {
//				System.out.println(aluno);
//			}
	}

}
