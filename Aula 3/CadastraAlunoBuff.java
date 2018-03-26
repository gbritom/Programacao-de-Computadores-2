package br.com.prog2.aula3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Gabriel Melandes
 */
public class CadastraAlunoBuff {

	public static void main(String[] args) throws IOException {

		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(ir);
		System.out.print("Digite a matrícula: ");
		String matricula = bf.readLine();
		System.out.print("Digite o nome: ");
		String nome = bf.readLine();
		// Só para fins didáticos, isto será melhorado mais para frente
		System.out.print("Digite o dia do nascimento: ");
		String dia = bf.readLine();
		System.out.print("Digite o mês do nascimento: ");
		String mes = bf.readLine();
		System.out.print("Digite o ano do nascimento: ");
		String ano = bf.readLine();

		// Criando objeto da classe DataPadraoBrasil
		DataPadraoBrasil dataDeNascimento = new DataPadraoBrasil(dia, mes, ano);
		// Criando objeto da classe Aluno
		Aluno aluno = new Aluno(Integer.parseInt(matricula), nome, dataDeNascimento);
		System.out.println("Matrícula: " + aluno.matricula + "\nNome: " + aluno.nome + "\nData de nascimento: "
				+ aluno.dataDeNascimento.toString());

		// fechando
		bf.close();
		ir.close();
	}
}
