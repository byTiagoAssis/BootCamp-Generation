package exemplos;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero: ");
		numero = leia.nextInt();
		
		if (numero == 0) {
			System.out.println("0 � um n�mero neutro ");
		}
		else if (numero< 0) {
			
			System.out.println("O n�mero que voc� digitou � negativo! ");
		}
		else if (numero%2 == 0) {
			
			System.out.println("O n�mero que voc� digitou � par! ");
		}
		else {
			System.out.println("O n�mero que voc� digitou � �mparr! ");
		}
	}

}
