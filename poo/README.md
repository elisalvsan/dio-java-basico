# Fundamentos da Programação Orientada a Objetos com Java


## Orientação a Objetos

- Assusntos
    - Conceito de POO
    - Pacotes e Visibilidade de recursos
    - Classes e Construtores
    - Java Beans e UML
    - Pilares do POO
    - Enums e Interfaces


### Conceitos de POO

O POO é um paradigma de programação baseado no conceito de "objetos", que podem conter dados na forma de campos, também conhecidos como *atributos*, e códigos, na forma de procedimentos, também conhecidos como métodos.

O que precisamos entender, é que cada vez mais linguagens se adequam ao cenário real, proporcionando assim que o programador desenvolva algoritimos mais próximo de fluxos comportamentais, logo tudo ao nosso redor pe representado como Objeto.

> Enquanto a programação estruturada é voltada a procedimentos e funções definidas pelo usuário, a programação orientada a objetos é voltada a conceitos como o de classes e objetos.

### Classes

Toda a estrutura de código na linguagem Java é distribuido em arquivos com extensão **.java** denominados de **classe.**

As classes existentes em nosso projeto serão compostas por:

**Identificador, Características e Comportamentos.**

- **Classe** *(class)*: A estrutura e ou representação que direciona a criação dos objetos de mesmo tipo.

- **Identificador** *(identity)*: Propósito existencial aos objetos que serão criados.

- **Características** *(states)*: Também conhecido como **atributos** ou **propriedades**, é toda informação que representa o estado do objeto.

- **Comportamentos** *(behavior)*: Também conhecido como **ações** ou **métodos**, é toda parte comportamental que um objeto dispõe.

- **Instanciar** *(new)*: É o ato de criar um objeto a partit de estrutura definida em uma classe.

![image of the example we will run](https://openbaraza.org/wp-content/uploads/2019/07/Student-class.png)

Iremos reproduzir está imagem em forma de código

// inserir codigo

Seguindo algumas convenções, as classes são classificadas como:

- **Classe de modelo (model)**: classes que representam estruturas de comínio da aplicação, exemplo: Cliente, Pedido, Nota Fiscal e etc.
- **Classe de serviço (service)**: classes que contém regras de negócio e validação de nosso sitema.
- **Classe de repositório (repository)**: classes que contém uma integração com banco de dados.
- **Classe de controle (controller)**: classes que possuem a finalidade de disponibilizar alguma comunicação extrena à nossa aplicação, tipo http web ou webservices.
- **Classe utilitária (util)**: classe que contém recursos comuns à toda nossa aplicação.

---

### Pacotes

A linguagem Java é composta por milhares de classes com as finalidades de, por exemplo: Classes de tipos de dados, representação de texto, números, datas, arquivos e diretórios, conexão a banco de dados, entre outras.

Para prevenir de acontecer uma desorganização de arquivos, a linguagem dispõe de um recurso que organiza as classes padrão e criadas por nós, que conhecemos como pacotes (package). Os pacotes são subdiretórios a partir da pasta src do nosso projeto onde estão localizadas as classes da linguagem e novas que forem criadas para o projeto. Existem algumas convenções para criação de pacotes já utilizados no mercado.

**Nomeclatura**

vamos imaginar que a sua empresa se chama **Power Soft** e ela está desenvolvendo sofftwares comercial, governamental e um software livre ou de código aberto. Abaixo teríamos os pacotes sugeridos conforme tabela abaixo: 

- **Comercial**: com.powersoft
- **Governamental**: gov.powersoft
- **Código aberto**: org.powersoft

**Identificação**

Quando uma classe é organizado por pacotes, ela passa a ter duas identificações. O nome simples (**próprio nome**) e agora o nome qualificado (**endereçamento do pacote + nome**).


**Package versus Import**

A localização de uma classe é definida pela palavra reservada package, logo, uma classe só contém uma definição de package no arquivo, sempre na primeira linha do código. Para utilização de uma classe existentes em outros pacotes, necessitamos realizar a importação das mesmas, seguindo a recomendação abaixo: 

```Java
package

import ...
import ...

public class MinhaClasse{

}
```

---

### Visibilidade dos recursos

**Modificadores**

Em Java, utilizamos três palavras reservadas e um conceito default (sem nenhuma palavra reservada) para definir os quatro tipo de visibilidade de atributos, métodos e até mesmo classes no que se refere ao acesso por outras classes.

Para uma melhor ilustração, iremos representar os conceitos de visibilidade de recursos através do contexto em uma lanchonete que vende lanche natural e suco.

*Modificador public*

Como o próprio nome representa, quando nossa classe, método e atributo é definido com public, qualquer outra classe em qualquer outro pacote pode visualizar tais recursos.

**Class Atendente**
```Java
package lanchonete;

public class Atendente {

	public void servindoMesa() {
		// ...?
		System.out.println("SERVINDO MESA");
	}
	
	public void pegarLancheCozinha() {
		System.out.println("PEGANDO O LANCHE NA COZINHA");
	}
	
	public void receberPagamento() {
		System.out.println("RECEBANDO PAGAMENTO");
	}
	
	public void trocarGas() {
		System.out.println("ATENDENTE TROCANDO O GAS");
	}
	
	public void pegarPedidoBalcao() {
		System.out.println("PEGANDO O PEDIDO NO BALCAO");
	}
}
```

**Class Almoxarife**
```Java
package lanchonete;

public class Almoxarife {

	public void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	
	public void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}
	
	public void entregarIgredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		// ...?
	}
	
	public void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GAS");
	}
	
}

```

**Class Cliente**
```Java
package lanchonete;

public class Cliente {
	
	public void escolherLanche() {
		System.out.println("ESCOLHANDO O LANCHE");
	}
	
	public void fazerPedido() {
		System.out.println("FAZENDO O PEDIDO");
	}
	
	public void pagarConta() {
		System.out.println("PAGANDO A CONTA");
	}
	
	public void consultarSaldoAplicativo() {
		System.out.println("CONSULTANDO SALDO NO APLICATIVO");
	}
	
	public void pegarPedidoBalcao() {
		System.out.println("PEGANDO O PEDIDO NO BALCAO");
	}
}
```

**Class Cozinheiro**
```Java
package lanchonete;

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

	public void pedirParaTrocarGas(Atendente meuAmigo) {
		meuAmigo.trocarGas();
	}

	public void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}

	public void pedirIngedientes(Almoxarife almoxarife) {
		almoxarife.entregarIgredientes();;
	}
}

```

**Class Estabelecimento**
```Java
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
```

*Modificador default*

O modificador *default* está fortemente associado a organização das classes por pacotes, algumas implementações não precisam estar disponíveis por todo o projeto, e é este modificador de acesso que restrige a visibilidade por pacotes.

Dentro do pacote **lanchonete**, iremos criar dois sub-pacotes para representar a divisão do estabelecimento.

- **lanchonete.atendimento.cozinha**: pacote que contém classes da parte da cozinha da lanchonete e atendimentos.
- **lanchonete.area.cliente**: pacote que contém classes relacionadas ao espaço do cliente.

![imagem de organização de pacotes](imagens/image.png)

**Modificador private**

Depois de reestruturar nosso estabelecimento(projeto), onde, temos as divisões (pacotes) espaço do cliente e atendimento, chegou a hora de uma reflexão sobre visibilidade ou modificadores de acesso.

Conhecemos as ações disponíveis nas classes Cozinheiro, Almoxarife, Atendente e Cliente, mesmo com a organização da visibilidade por pacotes, será se realmente estas classes precisam ser tão explicitas?

- Será se o Cozinheiro precisa saber que\como o Almoxarife controle as entradas e saídas?
- Que o Cliente precisa saber como o Atendente receve o pedido  para servir sua mesa?
- Que o Atendente precisa saber que antes de pagar o Cliente consulta o saldo no App?

---

### Getters e Setters

Seguindo a convensão Java Beans

Os métodos "Getters" e "Setters" são utilizados para buscar valores de atributos ou definir novos valores de atributos de instância de classes.

O método **Getter** retorna o valor do atributo especificado.

O método **Setter** define outro novo valor para atributo especificado.

Seguindo a convensão Java Beans, uma classe que contém está estrutura de estados deverá seguir as regras abaixo:

- Os atributos precisam ter o modificador de acesso **private**. Ex.: private String nome;

- Como agora os atributos estarão somente a nível de classe, precisamos dos métodos **get**X e **set**X. Ex.: getNome() e setNome(String novoNome);

- O método **get** é responsável por obter o valor atual do atributo, logo ele precisa ser public retornar um tipo correspondente ao valor. Ex.: public String getNome() {};

- O método **set** é responsável por definir ou modificador o valor de um atributo em um objeto, logo ele também precisa ser public, receber um parâmetro do mesmo tipo de variável mas não retorna nenhum valor void. Ex.: public void setNome(String novoNome);

---

### Construtores

Sabemos que para criar um objeto na linguagemm Java utilizamos a seguinte estrutura de código: 

```Java
Classe novoObjeto = new Classe();
```

Desta forma será criado um novo objeto na memória, este recurso também é conhecido como instanciar um novo objeto.

Muitas vezes já queremos que na criação	(instanciação) de um objeto, a linguagem já solicite para quem for criar este novo objeto defina algumas propriedades essenciasis.

---

### Enums

Enum é um tipo especial de classes onde os objetos são previamente criados, imutáveis e disponíveis por toda aplicação.

Usamos Enum quando o nosso modelo de negócio contém objetos de mesmo contexto que já exisem de pré-estabelecida com a certeza de não haver tanta alteração de valores.

**Exemplos:**

**Grau de Escolaridade**: Analfabeto, Fundamental, Médio, Superior, Doutorado, Mestrado.

**Estado Civil**: Solteiro, Casado, Divorciado, Viúvo.

**Estados Brasileiros**: São Paulo, Rio de Janeiro, Piauí, Maranhão.

> Não confunda uma lista de constantes com enum.

Enquanto que uma constante é uma variável de tipo com valor imutável, um enum é um conjunto de objetos já pre-definifos na aplicação.

Como um enum é um conjunto de objetos, logo, estes objetos podem conter atributos e métodos. Veja o exemplo de um enum para disponibilizar os quetros estados brasileiros citados acima, contendo informações de NOme, Sigla e um método que pega o nome do de cada estado e já retorna para tudo maiúsculo.

---

### UML

Linguagem de Modelagem Unificada ou UML é uma notação que possibilita a representação gráfica do projeto.

![diagrama uml](https://d2slcw3kip6qmk.cloudfront.net/marketing/pages/chart/UML-object-diagram-tutorial/Featured_Image.png)

As notações UML são distribuídas em duas categorias de diagramas, a estrutural e comportamental conforme listagem abaixo:

**Diagramas estruturais**

- **Diagrama de classe:** O Diagrama de Classes é utilizado para fazer a representação de estruturas de classes de negócio, interfaces e outros componentes do sitema. Por esta característica, este diagrama é considerado o mais importante para a UML, pois auxilia a maioria dos demais diagramas.

- **Diagrama de objetos:** Este diagrama representa os objetos existentes em um determinado instante ou fato na aplicação. Assim conseguimos ter uma perspectiva do estado de nossos objetos mediante a interação dos usuários no sistema.

---

**Diagrama de classe**

O diagrama de classe ilustra **graficamente** como classes serão estruturadas e interligadas entre si diante da proposta do nosso software.

Em diagrama a estrutura das classes é constituída por:

**Identificação**: Nome e/ou finalidade da classe

**Atributos**: Propriedades e/ou características

**Operações**: Ações e/ou métodos

---

**Relecionamentos**

Em um diagrama as classes podem existir de forma independente, mas obviamente haverá em alguma etapa da aplicação e necessidade de algumas se relacionarem, o que devemos compreender é o nível de dependência entre elas:

**Associação**

Uma associação define um relacionamento entre duas classes, permitindo que um objeto tenha acesso a estrutura de um outro objeto.

![tipos de associações](https://www.macoratti.net/20/09/c_tipassoc12.jpg)

- **Agregação**: Em uma agregação a classes principal contém uma relação com outra classes mas ela pode existir sem a classes agregadora. Imagina em um cadastro de Candidatos, podemos encontrar candidatos que ainda não possuam uma Profissão.

![exemplo 1](imagens/image-1.png)

- **Composição**: A composição já caracteriza uma dependência existencial entre a classe principal e a classes associada. Imaginamos que uma Admissão só poderá existir contendo suas informações básicas e a composição do Candidato selecionado.

![exemplo 2](imagens/image-2.png)

**Multiplicidade**

Nem sempre o relacionamento entre as classes será de **um para um**, um determinado cenário poderá exigir multiplicidades específicas conforme opções abaixo:

- 1 . -> Representa uma associação **contendo um elemento.**
- *. -> Representa uma associação **contendo uma lista de elementos.**
- 0..1 -> Representa uma associação **contendo zero ou um elemento.**
- 0..* -> Representa uma associação **contendo zero ou uma lista de elementos.**
- 1..* -> Representa uma associação **contendo um ou uma lista de elementos.**

**Visibilidade**

Os atributos e métodos de uma classe podem receber níveis de visibilidade, e na UML existem símbolos que representam cada um deles.

- (+) Visibilidade pública
- (#) Visibilidade protegida (muito associada com herança)
- (-) Visibilidade privada

**Representação**

![exemplo 3](imagens/image-3.png)
