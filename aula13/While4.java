package aula13;

import java.util.Scanner;

public class While4 {

	public static void main(String[] args) {
		int idade,sexo,fp,qtdPC=0,qtdMN=0,qtdHA=0,qtdOC=0,qtdPN40=0,qtdPC18=0,x=1;

		Scanner leia = new Scanner(System.in);
		
		while(x<=150)
		{
			System.out.print("Infome a idade: ");
			idade = leia.nextInt();
			System.out.println("Informe o sexo (1-feminino / 2-masculino / 3-Outros): ");
			sexo = leia.nextInt();
			System.out.println("Informe o fator psicológico da pessoa (1-calma / 2-nervosa / 3-agressiva): ");
			fp = leia.nextInt();
			
			if(fp==1)
			{
				qtdPC++;
			}
			if(sexo==1 && fp==2)
			{
				qtdMN++;
			}
			if(sexo==2 && fp==3)
			{
				qtdHA++;
			}
			if(sexo==3 && fp==1)
			{
				qtdOC++;
			}
			if(fp==2 && idade>40)
			{
				qtdPN40++;
			}
			if(fp==1 && idade<18)
			{
				qtdPC18++;
			}
			x++;
		}
		
		System.out.println("Número de pessoas calmas: "+qtdPC);
		System.out.println("Número de mulheres nervosas: "+qtdMN);
		System.out.println("Número de homens agressivos: "+qtdHA);
		System.out.println("Número de outros calmos: "+qtdOC);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: "+qtdPN40);
		System.out.println("Número de pessoas calmas com menos de 18 anos: "+qtdPC18);
	}

}
/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos. */