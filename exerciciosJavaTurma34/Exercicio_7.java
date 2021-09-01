package exerciciosJavaTurma34;

import java.util.Scanner;

public class Exercicio_7 {
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		double  a, b, c, d, E, f, x, y;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextDouble();
	
		System.out.println("Digite o valor de B: ");
		b = leia.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = leia.nextDouble();
		
		System.out.println("Digite o valor de D: ");
		d = leia.nextDouble();
		
		System.out.println("Digite o valor de E: ");
		E = leia.nextDouble();
	
		System.out.println("Digite o valor de F: ");
		f = leia.nextDouble();
	
		x = ((c*E)-(b*f))/((a*E)-(b*d));
	 	y = ((a*f)-(c*d))/((a*E)-(b*d));
	
	 	System.out.println("O valor de x é: " + x + " e o valor de y é: " + y);
		
	 	leia.close();
	}
}
