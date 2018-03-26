package br.com.prog2.aula4;

/**
 * @author Gabriel Melandes
 */
public class StringParaNumero {

	public static void main(String[] args) {

		System.out.println("Conversão Para integer:");
		String stringValor1 = new String("40028922");
		int intValor1 = Integer.parseInt(stringValor1);
		System.out.println(intValor1);

		System.out.println("Conversão Para float:");
		float fValor1 = Float.parseFloat(stringValor1);
		System.out.println(fValor1);

		System.out.println("Conversão toString");
		Double dValor1 = 65.12;
		String sValor = dValor1.toString();
		System.out.println(sValor);

		int a = 9999;
		System.out.println("Conversão do valor " + a + " para Binário: " + Integer.toBinaryString(a));
		System.out.println("Conversão do valor " + a + " para Octal: " + Integer.toOctalString(a));
		System.out.println("Conversão do valor " + a + " para Binário: " + Integer.toHexString(a));
	}

}
