package br.com.prog2.aula4;

/**
 * @author Gabriel Melandes
 */
public class ManipulandoString3 {
	public static void main(String[] args) {
		/*
		 * a) length() - retorna o tamanho da String (n�o confunda com o length de
		 * array).
		 */
		String s = "Programa��o de computadores III";
		System.out.println(s.length());
		/*
		 * b) charAt(int position) - captura um caracter de um String em uma posi��o
		 * espec�fica.
		 */
		char c = s.charAt(6);
		System.out.println(c);
		/*
		 * c) equals() - verifica o conte�do de duas Strings quanto � igualdade de
		 * conte�do, retorna um boolean (true ou false). O conte�do de duas Strings n�o
		 * pode ser verificado com a utiliza��o do operador ==, pois o mesmo ir�
		 * comparar as refer�ncias dos objetos e n�o seu conte�do.
		 */
		String s2 = new String("AAA");
		String s3 = new String("AAA");
		if (s2.equals(s3)) {
			System.out.println("S�o iguais");
		} else {
			System.out.println("S�o diferentes");
		}
		/*
		 * d) equalsIgnoreCase() - verifica o conte�do de duas Strings quanto �
		 * igualdade de conte�do, ignorando varia��es entre mai�sculas e min�sculas.
		 */
		String s4 = new String("aAA");
		String s5 = new String("AAA");
		if (s4.equalsIgnoreCase(s5)) {
			System.out.println("S�o iguais");
		} else {
			System.out.println("S�o diferentes");
		}
		/*
		 * e) compareTo() - compara duas Strings e devolve 0 (zero) se ambas forem
		 * iguais; um n�mero negativo se a String que chama o m�todo for menor que o
		 * String passada como par�metro ou um n�mero positivo se a String que chama o
		 * m�todo for maior que a String que for passado como par�metro. O significado
		 * do maior e menor � a posi��o dos caracteres no alfabeto.
		 */
		String s6 = new String("A");
		String s7 = new String("B");
		int res = s6.compareTo(s7);
		System.out.println(res);
		/*
		 * f) compareToIgnoreCase() - compara duas Strings ignorando varia��es entre
		 * mai�sculas e min�sculas e devolve 0 (zero) se ambas forem iguais; um n�mero
		 * negativo se a String que chama o m�todo for menor que o String passada como
		 * par�metro ou um n�mero positivo se a String que chama o m�todo for maior que
		 * a String que for passado como par�metro. O significado do maior e menor � a
		 * posi��o dos caracteres no alfabeto.
		 */
		String s8 = new String("A");
		String s9 = new String("a");
		int res1 = s8.compareToIgnoreCase(s9);
		System.out.println(res1);
		/*
		 * g) substring(int beginIndex) - retorna uma nova String, copiando um trecho
		 * indicado de uma String espec�fica. Neste caso, da posi��o (beginIndex) at� o
		 * fim da String.
		 */
		String sub = s.substring(12);
		System.out.println(sub);
		String sub1 = s.substring(12, 20);
		System.out.println(sub1);
		/*
		 * h) replace(char oldChar, char newChar) - substitui cada ocorr�ncia de um
		 * caracter em um String por outro. Substitui todas as ocorr�ncias de oldChar
		 * por newChar.
		 */
		String novaS = s.replace('r', 'l');
		System.out.println(novaS);
		/*
		 * i) indexOf(char caracter) - retorna a posi��o da primeira ocorr�ncia de um
		 * caracter num String. Retorna um valor inteiro com a posi��o do caracter ou -1
		 * caso o caracter n�o exista na String.
		 */
		int a = s.indexOf('a');
		System.out.println(a);
		int b = s.indexOf('c', 5);
		System.out.println(b);
		int posicao = s.indexOf('a', 5);
		int posicao1 = s.indexOf("bc");
		System.out.println(posicao + " " + posicao1);
		/*
		 * j) lastIndexOf() int = s.lastIndexOf( . . . ); este m�todo funciona de forma
		 * semelhante ao m�todo indexOf, com todas as sobrecargas, mas localiza a �ltima
		 * ocorr�ncia de em uma String, inicia a pesquisa a partir do fim da String.
		 * Retorna um valor inteiro com a posi��o do caracter ou -1 caso o caracter n�o
		 * exista na String.
		 */
		int posicao2 = s.indexOf('a');
		System.out.println(posicao2);
		/*
		 * k) toUpperCase() String = s.toUpperCase(); este m�todo gera um novo String
		 * com todas as letras em mai�sculas.
		 */
		String novaString = s.toUpperCase();
		System.out.println(novaString);
		/*
		 * l) toLowerCase() String = s.toLowerCase(); este m�todo gera uma nova String
		 * com todas as letras em min�sculas.
		 */
		String novaString1 = s.toLowerCase();
		System.out.println(novaString1);
		/*
		 * m) trim()s.trim(); este m�todo gera gera uma nova String removendo os
		 * caracteres em branco no in�cio e fim da String original.
		 */
		String novaString2 = s.trim();
		System.out.println(novaString2);
		/*
		 * n) startsWith() boolean = s2.startsWith(String prefixo); este m�todo verifica
		 * se um String � iniciada com uma sequ�ncia determinada de caracteres,
		 * retornando verdadeiro em caso afirmativo.
		 */
		boolean verd = s.startsWith("com");
		System.out.println(verd);
		/*
		 * o) endsWith() boolean = s.endsWith(String sufixo); verifica se uma String �
		 * encerrada com uma determinada sequ�ncia de caracteres, retornando verdadeiro
		 * em caso afirmativo.
		 */
		boolean verd1 = s.endsWith("res");
		System.out.println(verd1);
		/*
		 * p) split - o m�todo split divide uma String em v�rias substrings a partir de
		 * um caracter previamente definido.
		 */
		String s11 = "Nome,Endere�o,UF,CEP";
		String[] cabecalho = s11.split(",");
		System.out.println(cabecalho[0]);// Exibe Nome
		System.out.println(cabecalho[1]);// Exibe Endere�o
		System.out.println(cabecalho[2]);// Exibe UF
		System.out.println(cabecalho[3]);// Exibe CEP
	}
}
