package aula12;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Qual a sua idade: ");
		idade=leia.nextInt();
		
		System.out.print("Categoria: ");
		if(idade>=10 && idade<=14)
		{
			System.out.print("Infantil");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.print("Juvenil");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.print("Adulto");
		}
		else
		{
			System.out.print("Não especificada");
		}
		
		leia.close();
	}

}
/* 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto */