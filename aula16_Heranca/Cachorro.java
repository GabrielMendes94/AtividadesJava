package aula16_Heranca;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, int idade)
	{
		super(nome, idade);
	}

	@Override
	public void emitirSom() 
	{
		System.out.println("Au au au!!!");
	}
	
	public void acao2()
	{
		System.out.println("Correr...");
	}

}