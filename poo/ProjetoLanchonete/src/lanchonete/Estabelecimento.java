package lanchonete;

public class Estabelecimento {

	public static void main(String[] args) {

		Cozinheiro cozinheiro = new Cozinheiro();

		// açoes que não precisam estarem disponíveis para toda a aplicação

		cozinheiro.lavarIngredientes();
		cozinheiro.baterVitaminaLiquidificador();
		cozinheiro.selecionarIngredientesVitamina();
		cozinheiro.prepararLanche();
		cozinheiro.prepararVitamina();
		cozinheiro.prepararVitamina();

		// ações que o estabelecimento precisa ter ciência

		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();

		Almoxarife almoxarife = new Almoxarife();

		// açoes que não precisam estarem disponíveis para toda a aplicação
		almoxarife.controlarEntrada();
		almoxarife.controlarSaida();

		// ações que somente o seu pacote cozinha precisa conhecer (default)

		almoxarife.entregarIgredientes();
		almoxarife.trocarGas();

		Atendente atendente = new Atendente();

		atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servindoMesa();

		// ação que somente o seu pacote cozinha precisa conhecer (default)

		atendente.trocarGas();

		Cliente cliente = new Cliente();

		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();

		// não deveria, mas o estabelecimento ainda não definio normas de atendimento
		cliente.pegarPedidoBalcao();

		// esta ação é muito sigilosa, que tal ser privada?
		cliente.consultarSaldoAplicativo();

		// já pensou os clientes ouvindo que o gás acabou?
		cozinheiro.pedirParaTrocarGas(atendente);
		cozinheiro.pedirParaTrocarGas(almoxarife);
	}

}