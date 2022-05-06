package aula6emJava;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		int anos, meses, dias, totalDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade como pede a sequencia (Anos, Meses, Dias)\nAnos: ");
		anos=leia.nextInt();
		System.out.println("Meses: ");
		meses=leia.nextInt();
		System.out.println("Dias: ");
		dias=leia.nextInt();
		
		totalDias = (anos*365)+(meses*30)+dias;
		
		System.out.println("Sua idade em dias é: "+totalDias+" dias");
		leia.close();
	}

}
/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/