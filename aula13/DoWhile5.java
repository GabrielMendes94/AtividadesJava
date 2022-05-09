package aula13;

import java.util.Scanner;

public class DoWhile5 {

	public static void main(String[] args) {
		
		int x=1,somax=0;
		Scanner leia = new Scanner(System.in);

		do
		{
			System.out.print("Digite um número: ");
			x = leia.nextInt();
			somax+=x;
			
		}while(x!=0);

		System.out.println("Soma dos números digitados: "+somax);
	}

}
/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE) */