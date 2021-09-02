package exerciciosJavaLacosRepeticao;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int cont_pessoa = 1, sexo = 0, caracteristica, idade = 0, calmas = 0, nervosas = 0, agressivos = 0, menos18 = 0, mais40 = 0;

		while (cont_pessoa <= 150) {
				System.out.println(
						"Digite o número que corresponde ao seu sexo (1)feminino | (2)masculino | (3)Outros): ");
				sexo = entrada.nextInt();

				System.out.println("Digite sua idade: ");
				idade = entrada.nextInt();

				if (sexo == 1) {
					System.out.println(
							"Digite o número que corresponde a sua característica (1)Calma | (2)Nervosa | (3)Agressiva: ");
					caracteristica = entrada.nextInt();
					entrada.nextLine();
					if (caracteristica == 1) {
						calmas++;
					}
					if (idade < 18) {
						menos18++;
					} else if (caracteristica == 2) {
						nervosas++;
					}
					if (idade > 40) {
						mais40++;
					}
					cont_pessoa++;
				}

				if (sexo == 2) {
					System.out.println(
							"Digite o número que corresponde a sua característica (1)Calma | (2)Nervosa | (3)Agressiva: ");
					caracteristica = entrada.nextInt();
					entrada.nextLine();
					if (caracteristica == 1) {
						calmas++;
					}
					if (idade < 18) {
						menos18++;
					} else if (caracteristica == 2) {
						agressivos++;
					}
					if (idade > 40) {
						mais40++;
					}
					cont_pessoa++;
				}

				if (sexo == 3) {
					System.out.println(
							"Digite o número que corresponde a sua característica (1)Calma | (2)Nervosa | (3)Agressiva: ");
					caracteristica = entrada.nextInt();
					if (caracteristica == 1) {
						calmas++;
					}
					if (idade < 18) {
						menos18++;
					} else if (caracteristica == 2) {
						agressivos++;
					}
					if (idade > 40) {
						mais40++;
					}
					cont_pessoa++;
				}
				if (sexo != 1 && sexo != 2 && sexo != 3)
					System.out.println("Entrada inválida");
			}
		
		entrada.close();
		System.out.printf("\nTotal de pessoas calmas é: " + calmas + "\nTotal de mulheres nervosas é: " + nervosas
				+ "\nTotal de homens agressivos é: " + agressivos + "\nTotal outros calmos é: " + calmas
				+ "\nTotal de pessoas com mais de 50 anos é: " + mais40 + "\nTotal de pessoas com menos de 18 anos é: "
				+ menos18);
		
	}
	
}




