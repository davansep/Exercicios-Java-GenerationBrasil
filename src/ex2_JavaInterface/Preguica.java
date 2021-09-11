package ex2_JavaInterface;

public class Preguica extends SuperAnimal implements Animal{
	
	@Override
	public void somAnimal() {
		System.out.println("O som da Preguiça: aaAAh aaAAh");
	}

	@Override
	public void dormir() {
		System.out.println("Quando dorme faz: zzZZZ");
	}

}
