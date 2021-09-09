package ex4_JavaOrientacaoObjeto;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();

		func.setNome("Priscila");
		func.setProfissao("Programadora");

		System.out.println("Nome: " + func.getNome());
		System.out.println("Profissão: " + func.getProfissao());
		System.out.println("Cargo: " + func.cargo);
	}

}
