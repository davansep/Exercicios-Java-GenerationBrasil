package exerciciosJavaVetoresMatrizez;

import java.util.Scanner;

public class Exercicio_1 {
	
	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	double[] pontuacao = new double[5];
	double maiorNota = 0;
	int i;
	
	System.out.println("Informe às 5 notas da atividade!");
	for(i = 0; i <=4; i++) {
		System.out.println("Digite a " + (i + 1) + "ª Nota: ");
		pontuacao[i] = entrada.nextDouble();
		
		if(pontuacao[i] > maiorNota) {
			maiorNota = pontuacao[i];
		}
	entrada.close();
	}
	System.out.println("A maior nota foi: " + maiorNota);
	}
}
