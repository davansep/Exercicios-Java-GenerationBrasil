package ex1_JavaHeranca;

public class Animal {
	
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void correr() {
		System.out.println("Est� correndo....");
	}
	
	public void som() {
		System.out.println();
	}
	
	public void subir() {
		System.out.println("Est� subindo....");
	}
	
	
}
