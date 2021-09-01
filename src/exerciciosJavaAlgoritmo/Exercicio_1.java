package exerciciosJavaAlgoritmo;

import java.util.Scanner;

public class Exercicio_1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, idadeDias;
		
		System.out.println("Digite a sua idade em anos, meses e dias!" + "\nAnos: ");
		anos = leia.nextInt();

		System.out.println("Meses: ");
		meses = leia.nextInt();

		System.out.println("Dias: ");
		dias = leia.nextInt();
		
		idadeDias = (anos*365)+(meses*30)+dias;
		System.out.println("A sua idade em quant. de dias é: "+idadeDias+" dias");
	
		leia.close();
	}
}
