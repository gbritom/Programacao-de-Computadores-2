package br.com.prog2.aula4;

/**
 * @author Gabriel Melandes
 */
public class PagamentoLojas {

	public static void main(String[] args) {

		Pagamento pagamento1 = new Pagamento();
		pagamento1.valor = 100.78;
		pagamento1.diaDeAtraso = 6;
		pagamento1.ValorAPagar();

		Pagamento pagamento2 = new Pagamento();
		pagamento2.valor = 193.45;
		pagamento2.diaDeAtraso = 3;
		pagamento2.ValorAPagar();

		Pagamento pagamento3 = new Pagamento();
		pagamento3.valor = 245.08;
		pagamento3.diaDeAtraso = 1;
		pagamento3.ValorAPagar();

	}
}
