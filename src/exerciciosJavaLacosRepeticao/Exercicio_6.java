package exerciciosJavaLacosRepeticao;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero = 0, soma = 0, media = 0;
		System.out.println("Digite ( 0 ) para finalizar!");

		do {
			System.out.println("Digite um número inteiro: ");
			numero = leia.nextInt();
			if (numero % 3 == 0) {
				soma += numero;
				media++;
			}
		} while (numero != 0);

		System.out.println("A média é = " + soma/ media);
		leia.close();
	}
}
