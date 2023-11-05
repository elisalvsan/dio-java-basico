package lanchonete.atendimento.cozinha;

public class Cozinheiro {

	//pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGER NO BALCAO");
	}

	//pode ser default
	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANDO SUCO NO BALCAO");
	}

	//pode ser default
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}

	private void prepararLanche() {
		System.out.println("PREPARENDO LANCHE TIPO HAMBURGUER");
	}

	private void prepararVitamina() {
		System.out.println("PRAPARANDO SUCO");
	}

	@SuppressWarnings("unused")
	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	
	@SuppressWarnings("unused")
	private void selecionarIngredientesLanche() {
		System.out.println("SELECIONADO O PÃO, OVO E CARNE");
	}

	@SuppressWarnings("unused")
	private void selecionarIngredientesVitamina() {
		System.out.println("SELECIONADO FREUTA, LEITE E SUCO");
	}

	@SuppressWarnings("unused")
	private void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}

	@SuppressWarnings("unused")
	private void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
	}

	@SuppressWarnings("unused")
	private void fritarIngredietesLanche() {
		System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGER");
	}

	@SuppressWarnings("unused")
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}

	@SuppressWarnings("unused")
	private void pedirIngedientes(Almoxarife almoxarife) {
		almoxarife.entregarIgredientes();;
	}
}
