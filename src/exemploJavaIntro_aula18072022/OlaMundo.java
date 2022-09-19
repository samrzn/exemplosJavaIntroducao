package exemploJavaIntro_aula18072022;

public class OlaMundo {

	// impressão frase "olá mundo", estrutura de repetição "for" & aplicação de
	// condicionais "if" e "else" para criação do contador de números impares e pares.

	public static void main(String[] args) {
		System.out.println("Olá mundo!");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " é par.");
			} else {
				System.out.println(i + " é impar.");
			}
		}
	}
}