package br.com.helloWorld;

public class Main {

	public static void main(String[] args) {
		String nome = "Ruan";
		Integer codigo = 7;
		boolean status = true;
		int codigoTurma = 3;
		Double salario = 2500.0;
		int meses = 5;

		System.out.println("Código: " + codigo);
		System.out.println("Nome: " + nome);

		if (status) {
			System.out.println("Cadastro Ativo!!");
		} else {
			System.out.println("Cadastro Inativo!!");
		}

		switch (codigoTurma) {
		case 1:
			System.out.println("Setor: Tecnologia");
			break;
		case 2:
			System.out.println("Setor: Suporte");
			break;
		case 3:
			System.out.println("Setor: Desenvolvimento");
			break;
		default:
			System.out.println("Setor não encontrado");
		}
		System.out.println("*** Folha de Pagamento de " + nome + "***");
		for (int i = 0; i <= meses; i++) {
			System.out.println("Mês [" + i + "]: Salário R$" + salario);
		}

	}

}