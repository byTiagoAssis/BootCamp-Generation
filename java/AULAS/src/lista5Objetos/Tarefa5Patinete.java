package lista5Objetos;

import lista5Classes.T5Patinete;

public class Tarefa5Patinete {

	public static void main(String[] args) {
		T5Patinete patinete = new T5Patinete();

		patinete.versao = "Life";
		patinete.tempoAlugado = 3;

		System.out.printf("\nO modelo escolhido foi o da versao %s e ele tem autonomia de %d horas.", patinete.versao,
				patinete.autonomia);
		System.out.printf("\n Voc� escolheu alugar por %d horas, logo voc� vai pagar: %d reias pela loca��o",
				patinete.tempoAlugado, patinete.aluguel());

	}

}
