package Exemplo;

public class FactoryDeTintas {
	
	
	public CorGui criarCorPor(String nome) {
		CorGui cor = null;

		if ("preto".equals(nome)) {
			cor = new Preto();
		} else if ("Azul".equals(nome)) {
			cor = new Azul();
		}
		return cor;

	}

}
