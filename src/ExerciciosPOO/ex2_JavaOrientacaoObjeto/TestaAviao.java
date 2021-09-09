package ex2_JavaOrientacaoObjeto;

public class TestaAviao {

	public static void main(String[] args) {
		Aviao viao = new Aviao();

		viao.setCompanhia("GOL");
		viao.setModelo("Z-300");

		System.out.println("Companhia: " + viao.getCompanhia());
		System.out.println("Modelo: " + viao.getModelo());
		System.out.println("Fabricante: " + viao.fabricante);
	}

}
