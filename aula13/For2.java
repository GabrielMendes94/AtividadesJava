package aula13;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		
		int x,num,qtdPar=0,qtdImpar=0;
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=10;x++)
		{
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if(num%2==0)
			{
				qtdPar++;
			}else
			{
				qtdImpar++;
			}
		}
		System.out.println("Quantidade de pares: "+qtdPar+"\nQuantidade de ímpares: "+qtdImpar);
		
	}

}
/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/