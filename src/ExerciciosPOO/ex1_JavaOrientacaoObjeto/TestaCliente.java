package ex1_JavaOrientacaoObjeto;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente();

		cli1.setNome("Paranauê");
		cli1.setCpf("555.808.389.09");
		cli1.setEmail("coisarada_e_tal@gmail.com");
		cli1.setEndereço("rua seiquelá");
		cli1.setIdade(40);

		System.out.println("Nome do cliente: " + cli1.getNome());
		System.out.println("Idade: " + cli1.getIdade());
	}

}
