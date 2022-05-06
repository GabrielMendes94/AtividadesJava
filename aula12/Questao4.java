package aula12;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num=leia.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+" é par e sua raiz quadrada é: "+Math.sqrt(num));
		}
		else
		{
			System.out.println(num+" é ímpar e ao quadrado é: "+Math.pow(num, 2));
		}
		
		leia.close();
	}

}
/* 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado. */