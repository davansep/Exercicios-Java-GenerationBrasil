package ex2_JavaPolimorfismo;

public class Tigre extends Animal{
	
	@Override //---> Sobre-escrita de m�todo
	public void comer() {
		System.out.println("\nTigre comendo.....");
	}
	
	public void beber() {
		System.out.println("Tigre bebendo....");
	}

}
