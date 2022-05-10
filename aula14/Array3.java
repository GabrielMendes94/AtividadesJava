package aula14;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int l,c,val10=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite os valores da matriz: ");
		for(l=0;l<3;l++)
		{
			for(c=0;c<3;c++)
			{
				System.out.print("Matriz["+l+"]["+c+"]: ");
				matriz[l][c] = leia.nextInt();
				if(matriz[l][c]>10)
				{
					val10++;
				}
			}
		}
		
		System.out.println("A matriz possui "+val10+" valores maiores que 10.");

	}

}
/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/