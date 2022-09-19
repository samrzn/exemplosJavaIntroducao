package exemploJavaIntro_aula18072022;

import java.util.Scanner;

public class EntradaScanner {

	// entrada de dados pelo teclado com Scanner.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String x1 = teclado.nextLine();
		System.out.println("Digite sua idade:");
		int idade = teclado.nextInt();
		System.out.println(x1 + " tem " + idade + " ano(s).");
		teclado.close();
	}
}
