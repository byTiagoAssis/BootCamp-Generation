package lista1;
import java.util.Scanner;

//Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.


public class Tarefa1 {
public static void main(String[] args) {
		
		Scanner leia =  new Scanner(System.in);
		
		String nome;
		int dia,mes,ano;
		
		
		
		
		
		System.out.println("Digite seu nome: ");
		nome=leia.next();
		System.out.println("Em qual dia voc� nasceu " + nome.toUpperCase() + " ? ");
		dia = leia.nextInt();
		System.out.println("De que m�s foi mesmo ? ");
		mes = leia.nextInt();
		System.out.println(nome.toUpperCase() + " , e em qual ano ? ");
		ano = leia.nextInt();
		
		int diaEmDias = (30-dia);
		int mesEmDias = (mes*30);
		int AnoEmDias = ((2021-ano)*365);
		int vida = (diaEmDias+mesEmDias+AnoEmDias);
		
		System.out.println(nome.toUpperCase()+", voc� tem aproximadamente: " + vida+ " dias de vida");
}
}
