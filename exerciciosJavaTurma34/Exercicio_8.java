package exerciciosJavaTurma34;

import java.util.Scanner;

public class Exercicio_8 {
	
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	double custoFabrica, custoConsumidor, distribuidor;
	
	System.out.println("Entre com o custo de fábrica: ");
	custoFabrica = leia.nextDouble();
	
	distribuidor = custoFabrica + (custoFabrica*0.28);
	
	custoConsumidor = distribuidor + (distribuidor*0.45);
	
	System.out.printf("Custo ao consumidor: %.2f", + custoConsumidor);
	
	leia.close();
	
	}
}
