package aula6emJava;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		int idadeDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias: ");
		idadeDias=leia.nextInt();
		System.out.println("Você tem "+idadeDias/365+" ano(s), "+(idadeDias%365)/30+" mes(es), "
				+ "e "+(idadeDias%365)%30+"dia(s).");
		leia.close();

	}

}
/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e 
  mostre-a expressa em anos, meses e dias.*/