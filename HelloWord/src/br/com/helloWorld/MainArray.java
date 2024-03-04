package br.com.helloWorld;

import java.util.Scanner;

public class MainArray {

	public static void main(String[] args) {
		
		// Comando para entrada de dados
		Scanner scan = new Scanner(System.in);
		
		String[] nomes = new String[3];
		
		nomes[0] = "Harry";
		nomes[1] = "Rony";
		nomes[2] = "Bob";
		
		System.out.println("Digite o código do aluno: ");
		int codigo = scan.nextInt();
		
		if (codigo >= 0 && codigo < nomes.length) {
			System.out.println("Código do Aluno Válido \nAluno: "+ nomes[codigo]);
		}else {
			System.out.println("Código do Aluno Inválido");
		}
	
	}

}
