package ex2_JavaInterface;

public class TestaReinoAnimal {

	public static void main(String[] args) {
		
		Gato cat = new Gato();
		cat.setNome("Rubi");
		cat.setIdade(2);
		System.out.println("O nome da minha gata é " + cat.getNome() + ", ela tem " + cat.getIdade() + " anos.");
		cat.dormir();
		cat.somAnimal();
		
		
		Cachorro dog = new Cachorro();		
		dog.setNome("Billy");
		dog.setIdade(10);			
		System.out.println("\nO nome do meu cachorro é " + dog.getNome() + ", ele tem " + dog.getIdade() + " anos.");
		dog.dormir();
		dog.somAnimal();
		
		
		Preguica pri = new Preguica();
		System.out.println("\nA preguiça: ");
		pri.dormir();
		pri.somAnimal();
		
		
		Cavalo ponei = new Cavalo();
		ponei.setNome("Arco-íris");
		System.out.println("\nEu queria ter um pônei chamado " + ponei.getNome());
		ponei.dormir();
		ponei.somAnimal();	

	}

}
