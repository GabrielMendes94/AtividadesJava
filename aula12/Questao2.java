package aula12;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a=leia.nextInt();
		System.out.println("Digite o valor de B: ");
		b=leia.nextInt();
		System.out.println("Digite o valor de C: ");
		c=leia.nextInt();
		
		if(a<b && a<c)
		{
			System.out.print(a+", ");
			if(b<c)
			{
				System.out.print(b+", "+c);
			}
			else
			{
				System.out.print(c+", "+b);
			}
		}
		else if(b<a && b<c)
		{
			System.out.print(b+", ");
			if(a<c)
			{
				System.out.print(a+", "+c);
			}
			else
			{
				System.out.print(c+", "+a);
			}
		}
		else
		{
			System.out.print(c+", ");
			if(a<b)
			{
				System.out.print(a+", "+b);
			}
			else
			{
				System.out.print(b+", "+a);
			}
		}
		leia.close();

	}

}
//2- Faça um programa que entre com três números e coloque em ordem crescente.