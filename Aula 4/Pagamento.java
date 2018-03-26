package br.com.prog2.aula4;

import java.text.NumberFormat;

/**
 * @author Gabriel Melandes
 */

public class Pagamento {
	double valor;
	int diaDeAtraso;

	NumberFormat nf = NumberFormat.getCurrencyInstance();

	public void ValorAPagar() {
		double valorAPagar = (valor * (1.02 + (0.00035 * diaDeAtraso)));// *1.02 = valor + (valor * 2)
		System.out.println("Valor a pagar: " + nf.format(valorAPagar));
	}
}