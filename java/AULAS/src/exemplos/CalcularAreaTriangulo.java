package exemplos;

import java.util.Scanner;

public class CalcularAreaTriangulo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Triangulo t3 = new Triangulo();
		
		
		double a,b,h,e,f,g;
		
		System.out.print("Digite a base do primeiro tri�ngulo: ");
		 b = leia.nextDouble();
		
		System.out.print("Digite a altura do primeiro tri�ngulo: ");
		h = leia.nextDouble();
		
		
		a = ((b*h)/2);
		
		System.out.println(a);
		
		
		System.out.print("Digite a base do segundo tri�ngulo: ");
		 e = leia.nextDouble();
		
		System.out.print("Digite a altura do segundo tri�ngulo: ");
		f = leia.nextDouble();
		
		
		g = ((e*f)/2);
		
		System.out.println(g);
		
		
		
		
		
		if (a > g){
			
			System.out.print("O primeiro tri�ngulo � maior ");
			
		}
		
		else if (a < g) {
			System.out.print("O segundo tri�ngulo � maior ");
		}
		
		else if(a == g) {
			System.out.print("Os tri�ngulos s�o do mesmo tamanho ");
		}
		

	}

}
