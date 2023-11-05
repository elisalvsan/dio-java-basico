package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {

	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGER NO BALCAO");
	}

	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANDO SUCO NO BALCAO");
	}

	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}

	public void prepararLanche() {
		System.out.println("PREPARENDO LANCHE TIPO HAMBURGUER");
	}

	public void prepararVitamina() {
		System.out.println("PRAPARANDO SUCO");
	}

	public void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}

	public void selecionarIngredientesLanche() {
		System.out.println("SELECIONADO O PÃO, OVO E CARNE");
	}

	public void selecionarIngredientesVitamina() {
		System.out.println("SELECIONADO FREUTA, LEITE E SUCO");
	}

	public void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}

	public void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
	}

	public void fritarIngredietesLanche() {
		System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGER");
	}

	public void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}

	public void pedirIngedientes(Almoxarife almoxarife) {
		almoxarife.entregarIgredientes();;
	}
}
