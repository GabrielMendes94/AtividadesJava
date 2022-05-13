package aula16_Heranca;

public class Preguica extends Animal{
	
	private String outraAcao;
	
	public Preguica(String nome,int idade,String acao,String outraAcao)
	{
		super(nome,idade,acao);
		this.outraAcao=outraAcao;
	}
	
	public void imprimirInfo()
	{
		System.out.println("Nome: "+getNome()+" \nIdade: "+
		getIdade()+"\nAcão1: "+getAcao()+"\nAção2: "+outraAcao+"\n");
	}

	public String getOutraAcao() {
		return outraAcao;
	}

	public void setOutraAcao(String outraAcao) {
		this.outraAcao = outraAcao;
	}
	
}