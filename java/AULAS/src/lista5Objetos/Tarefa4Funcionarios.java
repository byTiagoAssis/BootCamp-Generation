package lista5Objetos;

import lista5Classes.T4Funcionarios;

public class Tarefa4Funcionarios {

	public static void main(String[] args) {
		
		T4Funcionarios colaborador = new T4Funcionarios();
		
		
		colaborador.nome="Z�";
		colaborador.cargo="Gerente";
		colaborador.pj='s';
		
		
		System.out.printf("O colaborador %s, exerce a fun��o de %s e tem o s�lario de %.2f",colaborador.nome,colaborador.cargo,colaborador.acrescimo('n'));

	}

}
