package ex1_JavaHeranca;

public class TestaAnimais {
	
	public static void main(String[] args) {
	
	Cachorro dog = new Cachorro();

	dog.setNome("Billy");		
	dog.setIdade(10);
	//dog.setCorrer("corria muito!");
	
	
	Preguica pri = new Preguica();
	
	pri.setNome("Eu");
	pri.setIdade(28);
	//pri.setSubir("gosto de subir em árvore para dormir em paz zzZZ!!!");

	
	Cavalo ponei = new Cavalo();
	
	ponei.setNome("Arco-íris");
	ponei.setIdade(5);
	//ponei.setCorrer("correr delicadamente...s2");
	
	
	System.out.println("\nO nome do meu cachorro era " + dog.getNome() + ", ele tinha " + dog.getIdade() + " anos e " + dog.getCorrer());
	dog.correr();
	
	System.out.println("\n" + pri.getNome() + " sou uma preguiça, tenho " + pri.getIdade() + " anos e " + pri.getSubir());
	pri.subir();
	
	System.out.println("\nEu queria ter um pônei chamado " + ponei.getNome()+ " para ficar olhando ele " + ponei.getCorrer());
	ponei.correr();
	}
}
