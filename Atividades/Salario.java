package br.com.prog2.atividade4;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

/**
 * 
 * @author Gabriel Melandes
 */
public class Salario {

	public static void main(String[] args) {
		int i = 1;
		while (i != 0) {

			String s = JOptionPane.showInputDialog("Digite o valor do salário bruto(digite 0 (zero) para parar): ");
			double salBruto = Double.parseDouble(s);
			double inss = 0, irpf = 0, aliquota = 0, parReduzida = 0, salLiquido;

			if (salBruto == 0) {
				break;
			} else if (salBruto > 0 && salBruto <= 1693.72) {
				inss = salBruto * 0.08;
			} else if (salBruto > 1693.72 && salBruto <= 2822.90) {
				inss = salBruto * 0.09;
			} else if (salBruto > 2822.90 && salBruto <= 5645.80) {
				inss = salBruto * 0.11;
			} else if (salBruto > 5645.80) {
				inss = 621.04;
			}
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			String s1 = JOptionPane.showInputDialog("Digite a quantidade de dependentes: ");
			int dependentes = Integer.parseInt(s1);

			irpf = salBruto - inss - (dependentes * 189.59);

			if (irpf >= 1903.99 && irpf <= 2826.65) {
				aliquota = 0.075;
				parReduzida = 142.80;
				irpf = irpf * aliquota - parReduzida;
			} else if (irpf >= 2826.66 && irpf <= 3751.05) {
				aliquota = 0.15;
				parReduzida = 354.80;
				irpf = irpf * aliquota - parReduzida;
			} else if (irpf >= 3751.06 && irpf <= 4664.68) {
				aliquota = 0.225;
				parReduzida = 636.13;
				irpf = irpf * aliquota - parReduzida;
			} else if (irpf > 4664.68) {
				aliquota = 0.275;
				parReduzida = 869.36;
				irpf = irpf * aliquota - parReduzida;
			}

			salLiquido = salBruto - inss - irpf;

			JOptionPane.showMessageDialog(null,
					"Salário bruto: " + nf.format(salBruto) + "\nDependentes: " + dependentes + "\nINSS: "
							+ nf.format(inss) + "\nIRPF: " + nf.format(irpf) + "\nSalário líquido: "
							+ nf.format(salLiquido));
		}
	}
}
