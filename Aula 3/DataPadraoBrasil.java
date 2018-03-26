package br.com.prog2.aula3;

/**
 * @author Gabriel Melandes
 */
public class DataPadraoBrasil {
	String dia;
	String mes;
	String ano;

	public DataPadraoBrasil(String dia, String mes, String ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
}
