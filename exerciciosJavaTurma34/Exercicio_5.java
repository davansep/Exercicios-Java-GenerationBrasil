package exerciciosJavaTurma34;

import java.util.Scanner;

public class Exercicio_5 {
	
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	double n1, n2, n3, media, mediaPonderada;

	System.out.println("Digite a nota 1: ");
	 n1 = leia.nextDouble();
	 
	 System.out.println("Digite a nota 2: ");
	 n2 = leia.nextDouble();
	 
	 System.out.println("Digite a nota 3: ");
	 n3 = leia.nextDouble();
	 
	 media = ((n1*2) + (n2*3) + (n3*5));
	 mediaPonderada = media / 10;
	 
	 System.out.println("A média ponderada é " + mediaPonderada);
	 
	 leia.close();
	}
}
