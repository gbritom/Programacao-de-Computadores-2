package br.com.prog2.aula3;

import java.util.Scanner;

/**
 * @author Gabriel Melandes
 */
public class CadastraAlunoScanner {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite a matrícula: ");
		int matricula = leitor.nextInt();
		System.out.print("Digite o nome: ");
		String nome = leitor.next();
		System.out.print("Digite o dia do nascimento: ");
		String dia = leitor.next();
		System.out.print("Digite o mês do nascimento: ");
		String mes = leitor.next();
		System.out.print("Digite o ano do nascimento: ");
		String ano = leitor.next();
		// Criando objeto da classe DataPadraoBrasil
		DataPadraoBrasil dataDeNascimento = new DataPadraoBrasil(dia, mes, ano);
		// Criando objeto da classe Aluno
		Aluno aluno = new Aluno(matricula, ano, dataDeNascimento);
		leitor.close();
	}

}
