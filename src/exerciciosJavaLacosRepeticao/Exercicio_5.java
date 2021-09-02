package exerciciosJavaLacosRepeticao;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero = 0, soma = 0;
		System.out.println("Digite ( 0 ) para finalizar!");

		do {
			System.out.println("Digite um número inteiro: ");
			numero = leia.nextInt();
			soma += numero;
		} while (numero != 0);

		System.out.println("O resultado da soma dos números digitados é: " + soma);
		leia.close();
	}
}
