package ex2_JavaInterface;

public class Gato extends SuperAnimal implements Animal{

	@Override
	public void somAnimal() {
		System.out.println("O som do Gato: miau miau");
	}

	@Override
	public void dormir() {
		System.out.println("O Gato quando dorme faz: sniff sniff");
	}
}
