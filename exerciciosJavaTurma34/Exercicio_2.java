package exerciciosJavaTurma34;

import java.util.Scanner;

public class Exercicio_2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, idadeDias;

		System.out.println("Digite a sua idade em dias: ");
		idadeDias = leia.nextInt();

		anos = idadeDias / 365;
		meses = ((idadeDias % 365) / 30);
		dias = ((idadeDias % 365) % 30);

		System.out.println("\nSua idade em anos é igual a: " + anos + " anos");

		System.out.println("\nSua idade em meses é igual a: " + meses + " meses");

		System.out.println("\nSua idade em dias é igual a: " + dias + " dias");
		
		leia.close();
		
	}
}
