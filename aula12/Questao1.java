package aula12;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a=leia.nextInt();
		System.out.println("Digite o valor de B: ");
		b=leia.nextInt();
		System.out.println("Digite o valor de C: ");
		c=leia.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println(a+" é o maior número.");
		}
		else if(b>c)
		{
			System.out.println(b+" é o maior número.");
		}
		else
		{
			System.out.println(c+" é o maior número.");
		}
		
		leia.close();	
	}

}
//1- Faça um programa que receba três inteiros e diga qual deles é o maior.