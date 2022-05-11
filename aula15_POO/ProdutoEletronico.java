package aula15_POO;

public class ProdutoEletronico {
	
	//declaração dos atributos da classe
	private String nomeProduto;
	private String marca;
	private double valor;
	private double peso;
	
	//declaração do método construtor
	public ProdutoEletronico(String nomeProduto,String marca,double valor,double peso)
	{
		this.nomeProduto = nomeProduto;
		this.marca = marca;
		this.valor = valor;
		this.peso = peso;
	}
	
	//declaração dos demais métodos da classe
	public void imprimirInfo()
	{
		System.out.println("Nome do produto: "+nomeProduto+"\nMarca: "+marca+
				"\nPreço: R$"+valor+"\nPeso: "+peso+"kg");
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
