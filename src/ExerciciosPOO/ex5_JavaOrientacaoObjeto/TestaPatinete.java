package ex5_JavaOrientacaoObjeto;

public class TestaPatinete {

	public static void main(String[] args) {
		Patinete func = new Patinete();

		func.setNome("Patinete El�trico Scooter");
		func.setMarca("Two Dogs");

		System.out.println("Nome: " + func.getNome());
		System.out.println("Marca: " + func.getMarca());
		System.out.println("Cor: " + func.cor);
		System.out.printf("Pre�o: R$ %.3f", func.preco);
	}

}
