package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
				double x = 0.00;
				double soma = 0.00;
				double media = 0.00;
				double contador = 0.00;
				
				while(x >=0){
					
					System.out.printf("Digite um n�mero: ");
					x = leia.nextDouble();
					soma = soma + x;
					contador++;
					if (x<0) {
						break;
					}
					
				
					
					
				}

				media = soma/contador;

				System.out.printf("\n O total do somat�rio � de %.0f ",soma);
				System.out.printf("\n O n�mero de valores informados � %.0f ",contador);
				System.out.printf("\n A m�dia dos valores informados � de %.2f ",media);

	}

}
