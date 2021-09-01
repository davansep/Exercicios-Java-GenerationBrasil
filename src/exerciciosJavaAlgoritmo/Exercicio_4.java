package exerciciosJavaAlgoritmo;

import java.util.Scanner;

public class Exercicio_4 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, r, s;

		System.out.println("Digite o valor de A: ");
		a = leia.nextDouble();

		System.out.println("Digite o valor de B: ");
		b = leia.nextDouble();

		System.out.println("Digite o valor de C: ");
		c = leia.nextDouble();

		r = Math.pow((a+b), 2.0);
		s = Math.pow((b+c), 2.0);
		d = ((r + s) / 2.0);

		System.out.println("O valor de R é: " + r);
		System.out.println("\nO valor de S é: " + s);
		System.out.println("\nO valor de D é: " + d);
		
		leia.close();
	}
}
