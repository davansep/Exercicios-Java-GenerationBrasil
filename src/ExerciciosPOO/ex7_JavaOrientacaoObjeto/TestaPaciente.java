package ex7_JavaOrientacaoObjeto;

public class TestaPaciente {

	public static void main(String[] args) {
		Paciente pc = new Paciente();

		pc.setNome("Priscila");
		pc.setCpf("123456789");

		System.out.println("Nome: " + pc.getNome());
		System.out.println("Cpf: " + pc.getCpf());
		System.out.println("Idade: " + pc.idade);

	}

}
