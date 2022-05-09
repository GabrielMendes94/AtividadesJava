package aula13;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		
		int idade=0,qtd21=0,qtd50=0;
		Scanner leia = new Scanner(System.in);
		
		while(idade!=-99)
		{
			System.out.print("Digite a idade da pessoa (ou -99 para sair): ");
			idade = leia.nextInt();
			
			if(idade!=-99 && idade<0)
			{
				System.out.println("Idade inválida!!!");
			}
			else if(idade!=-99 && idade<21)
			{
				qtd21++;
			}
			else if(idade!=-99 && idade>50)
			{
				qtd50++;
			}
		}
		System.out.println("Total de pessoas com menos de 21 anos: "+qtd21);
		System.out.println("Total de pessoas com mais de 50 anos: "+qtd50);

	}

}
/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE) */