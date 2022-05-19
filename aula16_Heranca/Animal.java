package aula16_Heranca;

public class Animal {
	
	private String nome;
	private int idade;
	
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public void emitirSom() 
	{
		System.out.println("Emitir som");
	}
	
	public void imprimirInfo()
	{
		System.out.println("Nome: "+nome+" \nIdade: "+
		idade);
	}

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

}