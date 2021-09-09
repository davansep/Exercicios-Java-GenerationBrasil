package ex3_JavaOrientacaoObjeto;

public class TestaProdutoEletronico {

	public static void main(String[] args) {
		ProdutoEletronico eletr = new ProdutoEletronico();

		eletr.setMarca("Samsung");
		eletr.setModelo("Flash F30");

		System.out.println("Marca: " + eletr.getMarca());
		System.out.println("Modelo: " + eletr.getModelo());
		System.out.println("Processador: " + eletr.processador);
	}

}
