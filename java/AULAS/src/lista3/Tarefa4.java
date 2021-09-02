package lista3;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		/* Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. 
		Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e 
		as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		o n�mero de pessoas calmas; 
		o n�mero de mulheres nervosas; 
		o n�mero de homens agressivos; 
		o n�mero de outros calmos;
		o n�mero de pessoas nervosas com mais de 40 anos; 
		o n�mero de pessoas calmas com menos de 18 anos.*/
		
		
		int x=0;
		int idade=0;
		char genero;
		char mental;
		int somaCalmo=0;
		int somaMN=0;
		int somaHA=0;
		int somaOC=0;
		int somaPN40=0;
		int somaPC18=0;
		
		
		
		while(x<3) {
			System.out.println("Digite sua idade: ");
			idade= leia.nextInt();
			System.out.println("Em qual genero voc� se define?\n(1-feminino / 2-masculino / 3-Outros) ");
			genero = leia.next().charAt(0);
			System.out.println("Como voc� est� se considera: \n (1- calma; 2- nervosa e 3- agressiva)");
			mental = leia.next().charAt(0);
			x++;
			
			if(mental == '1') {
				somaCalmo++;
			}
			if(genero == '1' && mental == '2') {
				somaMN++;
			}
			if(genero == '2' && mental == '3') {
				somaHA++;
			}
			if(genero == '3' && mental == '1') {
				somaOC++;
			}
			if(idade > 40 && mental == '2') {
				somaPN40++;
			}
			if(idade < 18 && mental == '1') {
				somaPC18++;
			}
		}
				System.out.printf("\nO n�mero de pessoas calmas � de %d.",somaCalmo);
				System.out.printf("\nO n�mero de mulheres nervosas � de %d.",somaMN); 
				System.out.printf("\nO n�mero de homens agressivos � de %d.",somaHA);
				System.out.printf("\nO n�mero de outros calmos � de %d.",somaOC);
				System.out.printf("\nO n�mero de pessoas nervosas com mais de 40 anos� de %d.", somaPN40);
				System.out.printf("\nO n�mero de pessoas calmas com menos de 18 anos � de %d.",somaPC18);

	}

}
