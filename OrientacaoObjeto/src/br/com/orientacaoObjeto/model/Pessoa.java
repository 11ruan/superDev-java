package br.com.orientacaoObjeto.model;

public class Pessoa {

	// Declaração dos atributos
	int id;
	String nome;
	Integer idade;
	boolean isNegativado;

	// Construtor Vazio
	public Pessoa() {

	}

	// Construtor para: ID, Nome
	public Pessoa(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	// Construtor para: ID
	public Pessoa(int id) {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public boolean isNegativado() {
		return isNegativado;
	}

	public void setNegativado(boolean isNegativado) {
		this.isNegativado = isNegativado;
	}

	// Métodos próprios
	public void validarSituacao() {
		if (this.isNegativado) {
			System.out.println(this.nome + " está com cadastro negativado!");
		} else {
			System.out.println("Cadastro ativo para: " + this.nome);
		}
		
	}

}
