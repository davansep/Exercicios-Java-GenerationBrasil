package exerciciosJavaLacosRepeticao;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int idade = 0, menos21 = 0, mais50 = 0;

		while (idade != -99) {
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();

			if (idade <= 21 && idade > 0) {
				menos21++;
			} else if (idade >= 50) {
				mais50++;
			}
		}
		System.out.printf("\nTotal de n�meros pessoas com menos de 21 anos �: " + menos21
				+ "\nTotal de n�meros pessoas com mais de 50 anos �: " + mais50);
		entrada.close();
	}
}
