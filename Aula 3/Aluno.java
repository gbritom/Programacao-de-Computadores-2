package br.com.prog2.aula3;

/**
 * @author Gabriel Melandes
 */
public class Aluno {
	Integer matricula;
	String nome;
	DataPadraoBrasil dataDeNascimento;

	public Aluno(int matricula, String nome, DataPadraoBrasil dataDeNascimento) {
		this.matricula = matricula;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
	}
}
