package br.com.prog2.aula3;

import javax.swing.JOptionPane;

/**
 * @author Gabriel Melandes
 */
public class CadastraAlunoJOPtionPane {

	public static void main(String[] args) {
		String matricula = JOptionPane.showInputDialog("Digite a matr�cula");
		String nome = JOptionPane.showInputDialog("Digite o nome");
		String dia = JOptionPane.showInputDialog("Digite o dia do nascimento");
		String mes = JOptionPane.showInputDialog("Digite o m�s do nascimento");
		String ano = JOptionPane.showInputDialog("Digite o ano do nascimento");
		DataPadraoBrasil dataDeNascimento = new DataPadraoBrasil(dia, mes, ano);
		Aluno aluno = new Aluno(Integer.parseInt(matricula), nome, dataDeNascimento);
		JOptionPane.showMessageDialog(null, "Matr�cula: " + aluno.matricula + "\nNome: " + aluno.nome
				+ "\nData de nascimento: " + aluno.dataDeNascimento.toString());
	}

}
