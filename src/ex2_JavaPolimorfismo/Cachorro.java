package ex2_JavaPolimorfismo;

public class Cachorro extends Animal{

	public void comer() {
		System.out.println("Cachorro comendo....");
	}
	
	public void dormir() {
		System.out.println("Cachorro dormindo zzZZZ");
	}

	@Override
	public void beber() {}


}
