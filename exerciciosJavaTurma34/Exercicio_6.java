package exerciciosJavaTurma34;

import java.util.Scanner;

public class Exercicio_6 {
	
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	double x1, x2, y1, y2, p1, p2, resultado;

	System.out.println("Digite o valor de x1: ");
	x1 = leia.nextDouble();

	System.out.println("Digite o valor de x2: ");
	x2 = leia.nextDouble();

	System.out.println("Digite o valor de y1: ");
	y1 = leia.nextDouble();

	System.out.println("Digite o valor de y2: ");
	y2 = leia.nextDouble();

	p1 = Math.pow((x2 - x1), 2.0);
	p2 = Math.pow((y2 - y1), 2.0);

	resultado = Math.pow((p1 + p2), 2.0);
	System.out.println("\nO resultado da distância é: " + resultado);
	
	leia.close();
	}
}
