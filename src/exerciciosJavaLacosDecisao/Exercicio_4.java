package exerciciosJavaLacosDecisao;

import java.util.Scanner;

public class Exercicio_4 {
	
	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
		int numero;
		
		System.out.println("Digite um número inteiro: ");
		numero = entrada.nextInt();
	
		if (numero % 2 == 0) { 
			System.out.printf("O número é par e a raiz quadrada é: %.2f", Math.sqrt(numero));
		}
		else {
			System.out.println("O número é ímpar e elevado ao quadrado: " + Math.pow(numero, 2));
		}
		
	entrada.close();
	}
}
