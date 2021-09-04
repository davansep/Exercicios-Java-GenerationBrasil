package exerciciosJavaVetoresMatrizez;

import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int[][] valores = new int[3][3];
		int soma = 0, somaDiagonal = 0;

		System.out.println("Digite um valor: ");
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				valores[l][c] = entrada.nextInt();

				soma += valores[l][c];
				if (l == c) {
					somaDiagonal += valores[l][c];
				}
			}
		}
		entrada.close();
		System.out.printf("A soma de todos os valores da matriz é: " + soma);
		System.out.printf("\nA soma dos valores da primeira diagonal é: " + somaDiagonal);
	}
}
