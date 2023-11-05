package lanchonete.atendimento.cozinha;

public class Almoxarife {

	@SuppressWarnings("unused")
	private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}
	
	void entregarIgredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		controlarSaida();
	}
	
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GAS");
	}
	
}
