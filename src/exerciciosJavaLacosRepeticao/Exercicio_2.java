package exerciciosJavaLacosRepeticao;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num = 0, par = 0, impar = 0;
			
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " +(i+1) + "� n�mero: ");
			num = entrada.nextInt();

			if (num % 2 == 0) {
				par++;				
			} else {
				impar++;
			}
		}
		System.out.printf("\nTotal de n�meros pares �: " + par + "\nTotal de n�meros �mpares �: " + impar);
		entrada.close();
	}
}
