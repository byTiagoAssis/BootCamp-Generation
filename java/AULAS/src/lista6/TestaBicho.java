package lista6;

public class TestaBicho {

	public static void main(String[] args) {
		Cachorro rex1 = new Cachorro("Thor",4);
		Gato bichano1 = new Gato("Bilss",3);
		Cavalo crista1 = new Cavalo ("Cuca",5);
		Preguica rubens1 = new Preguica("Barrichelo",11);
		
		rex1.emDuasPatas();
		System.out.println("O som que o cachorro faz � ");
		rex1.emitirSom();
		System.out.println("O som que o gato faz � ");
		bichano1.emitirSom();
		crista1.rolarChao();
		System.out.println("O som que o cavalo faz � ");
		crista1.emitirSom();
		System.out.println("O som quea pregui�a faz � ");
		rubens1.emitirSom();

	}

}
