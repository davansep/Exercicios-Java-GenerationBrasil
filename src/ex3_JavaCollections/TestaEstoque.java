package ex3_JavaCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaEstoque {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Estoque> estoque = new ArrayList<>();

		// Adicionar produtos
		System.out.println("Quantos produtos voc� deseja adicionar?");
		int qtdProdutos = sc.nextInt();

		for (int i = 0; i < qtdProdutos; i++) {
			System.out.println("\nInsira o tipo do " + (i + 1) + "� produto:");
			String tipo = sc.next();
			sc.nextLine();

			System.out.println("\nInsira a categoria do " + (i + 1) + "� produto:");
			String categoria = sc.nextLine();

			System.out.println("\nInsira a marca do " + (i + 1) + "� produto:");
			String marca = sc.nextLine();

			System.out.println("\nInsira a quantidade do " + (i + 1) + "� produto:");
			int quantidade = sc.nextInt();

			System.out.println("\nInsira o pre�o do " + (i + 1) + "� produto:");
			double preco = sc.nextDouble();

			int indice = i;

			estoque.add(new Estoque(tipo, categoria, marca, quantidade, preco, indice));

		}
		System.out.println();
		System.out.println("A lista completa dos produtos �: ");

		for (Estoque i : estoque) {
			System.out.print(i);
		}

		System.out.println("\nA quantidade de produtos cadastrados �: " + estoque.size());

		// Atualizar dados do ArrayList
		System.out.println("\nDigite o n�mero do indice do produto que voc� deseja alterar: ");
		int getIndiceAlterar = sc.nextInt();

		System.out.println(
				"\nTem certeza que deseja alterar esse produto? 0-N�o/1-Sim\n" + estoque.get(getIndiceAlterar));
		int getIndiceAlterar1 = sc.nextInt();

		if (getIndiceAlterar1 == 1) {
			estoque.remove(getIndiceAlterar);
			System.out.println("\nInsira o novo tipo do produto:");
			String tipo = sc.next();
			sc.nextLine();

			System.out.println("Insira a nova categoria do produto:");
			String categoria = sc.nextLine();

			System.out.println("Insira a nova marca do produto:");
			String marca = sc.nextLine();

			System.out.println("Insira a nova quantidade do produto:");
			int quantidade = sc.nextInt();

			System.out.println("Insira o novo pre�o do produto:");
			double preco = sc.nextDouble();

			int indice = getIndiceAlterar;

			estoque.add(getIndiceAlterar, new Estoque(tipo, categoria, marca, quantidade, preco, indice));

			System.out.println("\nO produto com �ndice " + getIndiceAlterar + " foi alterado!");
			System.out.println("\nA nova lista alterada ficou assim: \n" + estoque);

		} else {
			System.out.println("Remo��o cancelada, deseja remover outra posi��o?");
		}

		// Remover dados do ArrayList
		System.out.println("\nDigite o n�mero do indice do produto que voc� deseja deletar: ");
		int getIndice = sc.nextInt();

		System.out.println("\nTem certeza que deseja exluir esse produto? 0-N�o/1-Sim \n" + estoque.get(getIndice));
		int getIndice1 = sc.nextInt();

		if (getIndice1 == 1) {
			estoque.remove(getIndice);
			System.out.println("\nO produto com �ndice " + getIndice + " foi removido com sucesso!");
		} else {
			System.out.println("Remo��o cancelada, deseja remover outra posi��o?");
		}

		System.out.println("\nOs produtos restantes s�o: \n" + estoque);
		sc.close();
	}

}
