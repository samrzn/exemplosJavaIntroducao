package exemploJavaIntro_aula18072022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaBuffered {

	// entrada de dados pelo teclado com BufferedReader.

	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite seu nome:");
		String x1 = teclado.readLine();
		System.out.println("Digite sua idade:");
		int idade = Integer.parseInt(teclado.readLine());
		System.out.println(x1 + " tem " + idade + " ano(s).");
	}
}
