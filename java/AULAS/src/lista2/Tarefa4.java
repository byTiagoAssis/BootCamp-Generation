package lista2;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		// Fa�a um programa em que permita a entrada de um n�mero qualquer e 
		//exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; 
		//	se for �mpar exiba o n�mero elevado ao quadrado.
		Scanner leia = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um n�mero: ");
		numero = leia.nextDouble();
		
		if (numero == 0) {
			System.out.println("0 � um n�mero neutro ");
		}
		else if (numero< 0) {
			
			System.out.println("O n�mero que voc� digitou � negativo! ");
		}
		else if (numero%2 == 0) {
			numero = Math.sqrt(numero);
			System.out.println("O n�mero que voc� digitou � par! E sua raiz quadrada �: "+numero);
		}
		else {
			numero = numero*numero;
			System.out.println("O n�mero que voc� digitou � �mpar! E ele ao quadrado �: "+numero);
		}

	}

}
