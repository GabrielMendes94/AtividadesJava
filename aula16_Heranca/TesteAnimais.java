package aula16_Heranca;

public class TesteAnimais {

	public static void main(String[] args) {
		
		// instanciando um objeto de cada classe
		Cachorro cachorro = new Cachorro("Totó",4);
		cachorro.imprimirInfo();
		cachorro.emitirSom();
		cachorro.acao2();
		
		Cavalo cavalo = new Cavalo("Spirit",3);
		cavalo.imprimirInfo();
		cavalo.emitirSom();
		cavalo.acao2();
		
		Preguica preguica = new Preguica("Preguicinha",2);
		preguica.imprimirInfo();
		preguica.emitirSom();
		preguica.acao2();
	}

}