package aula16_Heranca;

public class Animal {
	
	private String nome;
	private int idade;
	private String acao;
	
	public Animal(String nome, int idade, String acao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.acao = acao;
	}
	
	public void imprimirInfo()
	{
		System.out.println("Nome: "+nome+" \nIdade: "+
		idade+"\nAcão: "+acao);
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
	
	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

}