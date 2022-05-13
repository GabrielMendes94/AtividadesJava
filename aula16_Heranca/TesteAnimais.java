package aula16_Heranca;

public class TesteAnimais {

	public static void main(String[] args) {
		
		// instanciando um objeto de cada classe
		Cachorro cachorro = new Cachorro("Totó",4,"emitir som","correr");
		cachorro.imprimirInfo();
		
		Cavalo cavalo = new Cavalo("Spirit",3,"emitir som","correr");
		cavalo.imprimirInfo();
		
		Preguica preguica = new Preguica("Preguicinha",2,"emitir som","subir em árvores");
		preguica.imprimirInfo();
		
	}

}