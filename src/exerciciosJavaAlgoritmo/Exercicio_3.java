package exerciciosJavaAlgoritmo;

import java.util.Scanner;

public class Exercicio_3 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int  horas, minutos, segundos, seg;
		
		System.out.println("Digite a duração do evento em segundos: ");
		segundos = leia.nextInt();
	     
	     horas = segundos / 3600;
	     minutos = ((segundos % 3600) / 60);
	     seg = ((segundos % 3600) % 60);
	     
	     System.out.println("\nA duração do evento foi de " + horas + " horas, " + minutos + " minutos e " + seg  + " segundos.\n");
	     
	     leia.close();
	}
}
