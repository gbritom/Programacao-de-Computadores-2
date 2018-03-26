package br.com.prog2.aula4;

/**
 * @author Gabriel Melandes
 */
public class ManipulandoString3 {
	public static void main(String[] args) {
		/*
		 * a) length() - retorna o tamanho da String (não confunda com o length de
		 * array).
		 */
		String s = "Programação de computadores III";
		System.out.println(s.length());
		/*
		 * b) charAt(int position) - captura um caracter de um String em uma posição
		 * específica.
		 */
		char c = s.charAt(6);
		System.out.println(c);
		/*
		 * c) equals() - verifica o conteúdo de duas Strings quanto à igualdade de
		 * conteúdo, retorna um boolean (true ou false). O conteúdo de duas Strings não
		 * pode ser verificado com a utilização do operador ==, pois o mesmo irá
		 * comparar as referências dos objetos e não seu conteúdo.
		 */
		String s2 = new String("AAA");
		String s3 = new String("AAA");
		if (s2.equals(s3)) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}
		/*
		 * d) equalsIgnoreCase() - verifica o conteúdo de duas Strings quanto à
		 * igualdade de conteúdo, ignorando variações entre maiúsculas e minúsculas.
		 */
		String s4 = new String("aAA");
		String s5 = new String("AAA");
		if (s4.equalsIgnoreCase(s5)) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}
		/*
		 * e) compareTo() - compara duas Strings e devolve 0 (zero) se ambas forem
		 * iguais; um número negativo se a String que chama o método for menor que o
		 * String passada como parâmetro ou um número positivo se a String que chama o
		 * método for maior que a String que for passado como parâmetro. O significado
		 * do maior e menor é a posição dos caracteres no alfabeto.
		 */
		String s6 = new String("A");
		String s7 = new String("B");
		int res = s6.compareTo(s7);
		System.out.println(res);
		/*
		 * f) compareToIgnoreCase() - compara duas Strings ignorando variações entre
		 * maiúsculas e minúsculas e devolve 0 (zero) se ambas forem iguais; um número
		 * negativo se a String que chama o método for menor que o String passada como
		 * parâmetro ou um número positivo se a String que chama o método for maior que
		 * a String que for passado como parâmetro. O significado do maior e menor é a
		 * posição dos caracteres no alfabeto.
		 */
		String s8 = new String("A");
		String s9 = new String("a");
		int res1 = s8.compareToIgnoreCase(s9);
		System.out.println(res1);
		/*
		 * g) substring(int beginIndex) - retorna uma nova String, copiando um trecho
		 * indicado de uma String específica. Neste caso, da posição (beginIndex) até o
		 * fim da String.
		 */
		String sub = s.substring(12);
		System.out.println(sub);
		String sub1 = s.substring(12, 20);
		System.out.println(sub1);
		/*
		 * h) replace(char oldChar, char newChar) - substitui cada ocorrência de um
		 * caracter em um String por outro. Substitui todas as ocorrências de oldChar
		 * por newChar.
		 */
		String novaS = s.replace('r', 'l');
		System.out.println(novaS);
		/*
		 * i) indexOf(char caracter) - retorna a posição da primeira ocorrência de um
		 * caracter num String. Retorna um valor inteiro com a posição do caracter ou -1
		 * caso o caracter não exista na String.
		 */
		int a = s.indexOf('a');
		System.out.println(a);
		int b = s.indexOf('c', 5);
		System.out.println(b);
		int posicao = s.indexOf('a', 5);
		int posicao1 = s.indexOf("bc");
		System.out.println(posicao + " " + posicao1);
		/*
		 * j) lastIndexOf() int = s.lastIndexOf( . . . ); este método funciona de forma
		 * semelhante ao método indexOf, com todas as sobrecargas, mas localiza a última
		 * ocorrência de em uma String, inicia a pesquisa a partir do fim da String.
		 * Retorna um valor inteiro com a posição do caracter ou -1 caso o caracter não
		 * exista na String.
		 */
		int posicao2 = s.indexOf('a');
		System.out.println(posicao2);
		/*
		 * k) toUpperCase() String = s.toUpperCase(); este método gera um novo String
		 * com todas as letras em maiúsculas.
		 */
		String novaString = s.toUpperCase();
		System.out.println(novaString);
		/*
		 * l) toLowerCase() String = s.toLowerCase(); este método gera uma nova String
		 * com todas as letras em minúsculas.
		 */
		String novaString1 = s.toLowerCase();
		System.out.println(novaString1);
		/*
		 * m) trim()s.trim(); este método gera gera uma nova String removendo os
		 * caracteres em branco no início e fim da String original.
		 */
		String novaString2 = s.trim();
		System.out.println(novaString2);
		/*
		 * n) startsWith() boolean = s2.startsWith(String prefixo); este método verifica
		 * se um String é iniciada com uma sequência determinada de caracteres,
		 * retornando verdadeiro em caso afirmativo.
		 */
		boolean verd = s.startsWith("com");
		System.out.println(verd);
		/*
		 * o) endsWith() boolean = s.endsWith(String sufixo); verifica se uma String é
		 * encerrada com uma determinada sequência de caracteres, retornando verdadeiro
		 * em caso afirmativo.
		 */
		boolean verd1 = s.endsWith("res");
		System.out.println(verd1);
		/*
		 * p) split - o método split divide uma String em várias substrings a partir de
		 * um caracter previamente definido.
		 */
		String s11 = "Nome,Endereço,UF,CEP";
		String[] cabecalho = s11.split(",");
		System.out.println(cabecalho[0]);// Exibe Nome
		System.out.println(cabecalho[1]);// Exibe Endereço
		System.out.println(cabecalho[2]);// Exibe UF
		System.out.println(cabecalho[3]);// Exibe CEP
	}
}
