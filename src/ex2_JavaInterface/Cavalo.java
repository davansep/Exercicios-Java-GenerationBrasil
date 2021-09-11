package ex2_JavaInterface;

public class Cavalo extends SuperAnimal implements Animal{

	@Override
	public void somAnimal() {
		System.out.println("O som do Cavalo: iiirrrrí rilinchin");
	}

	@Override
	public void dormir() {
		System.out.println("O cavalo quando dorme: zzZZZ");
	}

}
