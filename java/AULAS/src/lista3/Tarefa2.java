package lista3;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		
		int resposta=0;
		int par=0;
		int impar=0;
		
		for(int x=0; x<10; x++) {
			System.out.println("Digite um valor: ");
			resposta= leia.nextInt();
			
			if((resposta%2)==0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.printf("Voc� digitou %d n�meros pares e %d n�meros �mpares",par,impar);
	}

}
