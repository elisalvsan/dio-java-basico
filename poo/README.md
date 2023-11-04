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
