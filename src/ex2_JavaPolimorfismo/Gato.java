package ex2_JavaPolimorfismo;

public class Gato extends Animal{
	
	@Override //---> Sobre-escrita de m�todo
	public void comer() {
		System.out.println("\nGato comendo.....");
	}
	
	public void beber() {
		System.out.println("Gato bebendo....");
	}
	
	public void dormir() {
		System.out.println("Gato dormindo zzzZZZ");
	}

}
