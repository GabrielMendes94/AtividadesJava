package aula16_Heranca;

public class Cavalo extends Animal {
	
	public Cavalo(String nome,int idade)
	{
		super(nome,idade);
	}
	
	@Override
	public void emitirSom() 
	{
		System.out.println("Som do cavalo!!!");
	}
	
	public void acao2()
	{
		System.out.println("Correr...");
	}

}