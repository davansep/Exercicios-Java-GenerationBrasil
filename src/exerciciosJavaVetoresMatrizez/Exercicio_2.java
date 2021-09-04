package exerciciosJavaVetoresMatrizez;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int lancamento[] = new int[10], soma = 0, quantidade = 0; // 0...9
		double media = 0.0;

		System.out.println("Jogue o dado!");

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite a " + (i + 1) + "ª rodada: ");
			lancamento[i] = entrada.nextInt();

			media += lancamento[i];

			if (lancamento[i] <= soma) {
				if (soma == lancamento[i]) {
					quantidade++;
				}
			} else {
				soma = lancamento[i];
				quantidade++;
			}
			if (lancamento[i] < quantidade) {
				quantidade = lancamento[i];
			}
		}
		entrada.close();
		System.out.println("A maior nota foi: " + soma + "\nQuantidade: " + quantidade + "\nMédia: " + media / 10);
	}
}
