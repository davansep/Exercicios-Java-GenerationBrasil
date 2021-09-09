package ex6_JavaOrientacaoObjeto;

public class TestaContaBancaria {

	public static void main(String[] args) {
		ContaBancaria cb = new ContaBancaria();

		cb.setNome("Priscila");
		cb.setCpf("123456789");

		System.out.println("Nome: " + cb.getNome());
		System.out.println("Cpf: " + cb.getCpf());
		System.out.println("Idade: " + cb.idade);
		System.out.printf("Saldo: R$ %.3f", cb.saldo);
	}

}
