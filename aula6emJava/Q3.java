package aula6emJava;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		int totalSegundos,hora,minuto,segundo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o tempo do evento em segundos: ");
		totalSegundos=leia.nextInt();
		
		hora = totalSegundos / 3600;
		minuto = (totalSegundos%3600) / 60;
		segundo = (totalSegundos%3600) % 60;
		System.out.println("O evento durou: "+hora+" hora(s) "+minuto+" minuto(s) e "+segundo+" segundo(s)");
		
		leia.close();
	}

}
/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/