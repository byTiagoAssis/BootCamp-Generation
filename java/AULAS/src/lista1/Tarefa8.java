package lista1;

import java.util.Scanner;

public class Tarefa8 {

	public static void main(String[] args) {
		
		Scanner leia =  new Scanner(System.in);
		
		double custoFabrica;
		double custoDistribuidor;
		double custoImposto;
		double precoFinal;

		System.out.println("Digite o valor do custo de f�brica : ");
		custoFabrica = leia.nextDouble();

		custoDistribuidor = (custoFabrica*28)/100;
		custoImposto = (custoFabrica*15)/100;
		precoFinal= custoFabrica+custoImposto+custoDistribuidor;

		System.out.println("O pre�o do carro para o cliente final ser� de: " + precoFinal);

	}

}
