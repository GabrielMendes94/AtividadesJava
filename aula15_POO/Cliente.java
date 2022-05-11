package aula15_POO;

public class Cliente {
	
	//declaração dos atributos da classe
	private String nome;
	private String dataNascimento;
	private String telefone;
	private String endereco;
	
	//declaração do método construtor
	public Cliente(String nome,String dataNascimento,String telefone,String endereco)
	{
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	//declaração dos demais métodos da classe
	public void imprimirInfo()
	{
		System.out.println("Nome: "+nome+" \nData de nascimento: "+
		dataNascimento+"\nTelefone: "+telefone+"\nEndereço: "+endereco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console. */