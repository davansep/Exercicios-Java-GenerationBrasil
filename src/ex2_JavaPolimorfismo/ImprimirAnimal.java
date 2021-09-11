package ex2_JavaPolimorfismo;

public class ImprimirAnimal {

	public static void main(String[] args) {
		
		TestaAnimal objeto = new TestaAnimal();
		
		objeto.fazerAnimal(new Cachorro());
		
		objeto.fazerAnimal(new Tigre());
		
		objeto.fazerAnimal(new Gato());
	}
}
