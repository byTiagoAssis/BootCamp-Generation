package lista2;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		// Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		Scanner leia = new Scanner(System.in);
		
		
		int numero1;
		int numero2;
		int numero3;
		int numeroMaior=0;
		
		System.out.println("Por favor, digite 3 n�meros inteiros ");
		System.out.print("Por favor digite N1: ");
		numero1 =leia.nextInt();
		
		System.out.print("Por favor digite N2: ");
		numero2 = leia.nextInt();
		
		System.out.print("Por favor digite N3: ");
		numero3 =leia.nextInt();
		
		
		
		if (numero1 < 0 || numero2 < 0 || numero3 <0) {
			
			System.out.println("Aten��o, valor �nvalido");
		}
		if (numero1 > numeroMaior) {
			numeroMaior = numero1;
		}
		if (numero2 > numeroMaior) {
			numeroMaior = numero2;
		}
		if (numero3 > numeroMaior) {
			numeroMaior = numero3;
		}
		
		System.out.printf("O maior n�mero digitado foi: %d",numeroMaior);
		

	}

}
