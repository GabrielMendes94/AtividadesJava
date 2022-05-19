package aula16_Heranca;

public class Preguica extends Animal{
	
	public Preguica(String nome,int idade)
	{
		super(nome,idade);
	}
	
	@Override
	public void emitirSom() 
	{
		System.out.println("Som da preguiça!!!");
	}
	
	public void acao2()
	{
		System.out.println("Subir em árvores...");
	}
	
	
}