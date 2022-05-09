package aula13;

import java.util.Scanner;

public class DoWhile6 {

	public static void main(String[] args) {
		
		int x=1;
		float qtdMult3=0,somaMult3=0;
		Scanner leia = new Scanner(System.in);

		do
		{
			System.out.print("Digite um número inteiro (ou 0 para sair): ");
			x = leia.nextInt();
			if(x%3==0 && x!=0)
			{
				qtdMult3++;
				somaMult3+=x;
			}
			
		}while(x!=0);
		
		System.out.print("Média dos números múltiplos de 3 digitados: "+somaMult3/qtdMult3);
		
	}

}
/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE) */