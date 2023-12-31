## Anotações de aprendendo a sintaxe java

### Aula de anatomia de classes

---
~~~Java
public class edu.andrade.anatomiaclasses.NomearVariavel {

    public static void main(String[] args) {
        /*quando se tem uma variavel que é toda maiuscula se presupoe que ela é final
         e que não pode sofrer nenhum tipo de alteração
         */
        final String BR = "Brasil";
        /* BR = "Brazil";
        Está variavel não pode ser alterada */
    }
}
~~~

~~~Java
public class edu.andrade.anatomiaclasses.NomearVariavel {

    public static void main(String[] args) {
        // Declarações inválidas de variáveis
        int numero&num =1; // Os unicos simbolos permitidos são _ e $
        int 1numero = 1; // Não pode se iniciar com numerico
        int numero um = 1; // Não pode conter espaço entre o nome da variavel
        int long = 1; // Não pode atribuir uma palavra reservada para nomear uma variavel
    }
}
~~~
```Java
public class edu.andrade.anatomiaclasses.NomearVariavel {

    public static void main(String[] args) {
        // Declarações válidas de variáveis
        int numero$um = 1;
        int numero1 = 1;
        int numeroum = 1;
        int longo = 1;
    }
}
```
---
Declarar uma **variável** em Java segue sempre a seguinte estrutura:
```Java
    // Estrutura
    
    Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)

    // Exemplo
    
    int idade = 23;
    double altura = 1.62;
    Dog spike;
```
---
Declarando **métodos** em Java segue uma estrutura bem simples:
```Java
    // Estrutura
    TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

    // Exemplo
    int somar (int numero1, int numero2){}

    String formatarCep(long cep)
```
---
**Indentar** é um termo utilizado para escrever o código do 
programa de forma hierárquica, facilitando assim a
visualiazção e o entendimento do programa.

```Java
    public class BoletimEstudantil {

    //CODIGO NÃO IDENTADO
    public static void main(String[] args) {
     int mediaFinal = 6;
     if(mediaFinal<6) 
     System.out.println("REPROVADO");
     else if(mediaFinal==6)
     System.out.println("PROVA MINERVA");
     else
     System.out.println("APROVADO");
    }
}
```
```Java
    public class BoletimEstudantil {

    //CODIGO IDENTADO
    public static void main(String[] args) {
        int mediaFinal = 6;
        if(mediaFinal<6) 
            System.out.println("REPROVADO");
        else if(mediaFinal==6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }
}
```
---
**Organizando arquivos**
    
À medida que o sistema vai evoluindo, surgem novos arquivos(código fonte)
em nossa estrutura de arquivos do projeto. Isso exige que seja realizado
uma organização desses arquivos através de **pacotes (packeges)**.
---
**Java Beans**

Uma das maiores dificuldades na programação é escrever algoritmos legíveis
a níveis que sejam compreendidos por todo o seu time ou por você mesmo no
futuro. Para isoo a linguagem Java sugere, através de convenções, formas de
escrita universal para nossas classes, atributos, métodos e pacotes.

**Variáveis**

Sugestções de nomenclatura:

 - Uma varíavel deve ser clara, sem abreviações ou definição sem sentido;
 - Uma variável é sempre no singular, **exeto quando se referir a um array ou coleção**;
 - Defina um idioma único para suas variávei. Se você for declarar variáveis
em inglês, defina todas em inglês.

Não recomendado:
~~~Java
double salMedio = 1500.23; //variável abreviada
String emails = "aluno@escola.com"; //confuso se a variável recebe somente um valor ou varios
String myName = "Antony"; //se idioma pt-BR, remomendado seguir tudo em portugues
~~~

Recomendado:
~~~Java
double salarioMedio = 1500.23;
String email = "aluno@escola.com";
String [] emails = {"aluno@escola.com","professor@escola.com"};
String meuNome = "Antony";
~~~

**Métodos**

Deverão ser nomeados como verbos, através de uma mistura de letras minúsculas
e maiúsculas. Em princípio todas as letras que compõem o nome devem ser mantidas
em minúsculo, com exceção da primeira letra de cada palavra composta a partir
da segunda palavra.

Exemplos sugeridos para nomeclatura de métodos: 
~~~Java
somar(int n1, int n2){}

abrirConexao(){}

concluirProcessamento(){}

findById(int id){}

calcularImprimir(){} //este método deveria ter uma única finalidade
~~~

---

### Aula de Tipos e Variáveis

**Tipos de dados**

No Java, existem algumas palavras reservadas para a representação dos 
tipos de dados básicos que precisam ser manipulados para a construção
de programas. Estes tipos de dados são conhecidos como tipos primitivos.

    ℹ Os oitos tipos primitivos em Java são:
    int, byte, short, long, float, double, boolean, char - esses tipos não são considerados 
    objetos, e portanto representam valores brutos. Eles são armazenados diretamente na pilha 
    de memória. (Memory stack)

**Declaração de Variáveis**

Variável é uma identificação de um espaço em memória utilizado pelo nosso
programa. Seguindo as convenções em linguagem de programação, toda variável
é composta por: tipo de dados + identificação + valor atribuído.

A estrutura padrão para se declarar uma variável sempre é:
~~~
<Tipo> <nomeVariavel> <atribuicaoDeValorOpicional>
~~~

Exemplos abaixo:

~~~Java
int idade;
int anoFabricacao = 2021;
double salarioMinimo = 2500;
~~~

    ⚠ Existem algumas peculiaridades a trabalhar com alguns tipos especificos.
Observe no exemplo abaixo:

~~~Java
public class TiposDados{
    public static void main(String[] args){
      byte idade = 123;
      short ano = 2023;
      int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
      long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
      float pi = 3.14F;  
      double salario = 1275.33;
    }
    
    }
~~~

    ⚠ JAVA É FORTMENTE TIPADO

**Constantes**

São valores armazenados em memória que não podem ser modificados depois
de declarados. Em Java, esses valores são representados pela palavra 
reservada _final_, seguida do tipo.

Por convenção, **constantes** são sempre escritas em CAIXA ALTA.

Abaixo temos um exemplo sobre o uso de variáveis e constantes:

~~~JAVA
public class TiposVariaveis {
    public static void main(String[] args) {

        //declaro uma variável do tipo inteiro e atribuo a ela o valor 5.
        int numero = 5;

        /*altero o valor da variável para 10,
        não é necessario declarar o tipo dela novamente,
        pois já foi declarado acima.*/
        numero = 10;
        System.out.println(numero);

        /* tem que ser declarada final além da convensão de nome
            para que esse valor não possa ser alterado.
         */

        final double VALOR_DE_PI = 3.14;
    }
}
~~~
---

### Aula de Operadores

Operadores são símbolos especiais que tem um significado próprio para a 
linguagem e estão associados a determinadas operações.

**Classificação do operadores**

**Atribuição**

Representando pelo símbolo de igualdade =.

É utilizado para definir o valor inicial ou sobrescrever o valor de uma
variável.

**Aritméticos**

O operador aritmético é utilizado para realizar operações matemáticas entre
valores numéricos, podendo se tornar ou não uma expressão mais complexa.

Os operadores são: + (adição), - (subtração), * (multiplicação) e / (divisão).

    ℹ O OPERADOR DE ADIÇÃO (+), QUANDO UTILIZADO EM VARIÁVEIS DO TIPO TEXTO, 
    REALIZARÁ A "CONCATENAÇÃO DE TEXTOS"

**Unário**

São aplicados juntamente com um outro operador aritmético. Eles realizam alguns
trabalhos básicos como incrementar, decrementar, inverter valores numéricos e
booleanos.

- (+) **Operador unário de valor positivo** - números são positivos sem esse
operador explicitamente;
- (-) **Operador unário de valor negativo** - nega um número ou expressão
aritmética;
- (++) **Operador unário de incremento de valor** - incrementa o valor em 1
unidade;
- (--) **Operador unário de decremento de valor** - decrementa o valor em 1
unidade;
- (!) **Operador unário lógico de negação** - nega o valor de uma expressão
booleana.

**Ternário**

É uma forma resumida para definir uma condição e escolher por um dentre dois valores.

O operador ternário é representado pelos simbolos ?: utilizados na seguinte estrutura
de sintaxe: 

    <Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>

**Relacionais**

Avaliam a relação entre duas variáveis ou expressões. Neste caso, mas precisamente,
definem se o operado à esquerda é igual, diferente, menor, menor ou igual, maior ou
maior ou igual ao da direita, retornando um valor booleano como resultado.

- == Quando desejamos verificar se uma variável é IGUAL A outra. 
- != Quando desejamos verificar se uma variável é DIFERENTE da outra.
- '>' Quando desejamos verificar se uma variável é MAIOR QUE a outra.
- '>=' Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
- < Quando desejamos verificar se uma variável é MENOR QUE a outra.
- <= Quando desejamos verificar se uma variável é MENOOR OU IGUAL a outra.

**Lógicos**

Os operadores lógicos representam o recurso que nos permite criar expressões
lógicas maiores a partir da junção de duas ou mais expressões.

- && Operador Lógico "E"
- || Operador Lógico "OU"
---
### Aula de Métodos

    Todas as ações das aplicações são consideradas métodos

Uma classe é definida por atributos e métodos. Vimos que atributos são, em sua
grande maioria, variáveis de diferentes tipos e valores. Os métodos, por sua vez,
correspondem a **funções** ou **sub-rotinas** disponíveis dentro de nossas classes.

**Critério de nomeação de Métodos**

Esses critérios não são obrigatórios, mas é recomendácel que sejam seguidos, pois
essas convenções facilitam a vida dos programadores ao trabalharem em códigos de forma
colaborativa. Ao seguir estas convenções, tornamos o código mais legível.

**Critérios:**

- Deve ser nomeado como verbo
- Seguir o padrão camelCase (Todas as letras minúsculas com exceção da primeira letra
da segunda palavra).
    

    ℹ NÃO EXISTE EM JAVA O CONCEITO DE MÉTODOS GLOBAIS. TODOS OS MÉTODOS DEVEM SEMPRE SER DEFINIDOS
    DENTRO DE UMA CLASSE.

**Critério de definição de métodos**

Como saber a melhor forma de definir os métodos das nossas classes? Para chegar as esta
conclusão, somos auxiliados por uma convenção estrutural para todos os métodos. Essa
convenção é determinada pelos aspectos abaixo:

1. **Qual a proposta principal do método?** Você deve se perguntar constantemente até
compreender a real finalidade do mesmo.
2. **Qual o tipo de retorno esperado após executar o método?** Você deve analisar se
o método será responsável por retornar algum valor ou não.
3. **Quais os parâmetros serão necessários para execução do método?** Os métodos as vezes
precisão de argumentos como críterios para a execução.
4. **O método possui o risco de apresentar alguma exceção?** Exceções são comuns na
execução de métodos, as vezes é necessário prever a tratar a possível existência de uma
exceção.
5. **Qual a visibilidade do método?** Será necessário que o método seja visível a toda
aplicação, somente em mesmo pacotes, através de herança ou somente a nível a própria
classe.

**Exemplo:**

~~~Java
public class MyClass{
    public double somar(int num1, int num2){
        //logica - finalidade do método
        return ...;
    }
    
    public void imprimir(String texto){
        //logica - finalidade do método
    }
    
    // throws Exception: indica que o método ao ser utilizado poderá gerar uma exceção
    public double dividir(int dividendo, int divisor) throws Exception{}
    
    //método privado, não pode ser visto por outras classes
    private void metodoPrivado(){}
    
    //alguns equívocos estruturais
    public void validar(){
        //este método deveria retornar algum valor
        //no caso boolean (true ou false)
    }
    
    public void calcularEnviar(){
        //um método deve representar uma única responsabilidade
    }
    
    public void gravarCliente(String nome, String cpf, Integer idade){
        //este método tem a finalidade de gravar
        //informações de um cliente, por que não criar
        //um objeto cliente e passar como parâmetro
        //veja abaixo
    }
    
    public void gravarCliente(Cliente cliente){}
    //ou
    public void gravar(Cliente cliente){}
    
}
~~~

[PROJETO SOBRE TODOS OS ASSUNTOS](https://github.com/elisalvsan/dio-java-basico/tree/main/sistema-smart-tv)

---

### Aula de escopo

O escopo pode ser entendido como o ambiente onde uma variável pode ser acessada. Em
Java, o escopo de variáveis **vai de acordo com o bloco onde ela foi declarada.**

A variável é criada no primeiro acesso à ela, se tornando inacessível após o 
interpretador sair do bloco de execução ao qual ela pertence. Portanto, esta
variável não pode ser lida ou manipulada por rotinas e códigos que estão fora do
seu bloco de declaração, ou seja, fora do escopo da variável.

Em uma Classe, podemos visualizar a diferença de escopos. Os atributos(variáveis)
são declarados no corpo principal da Classe, sendo portanto acessíveis por todo os
métodos.

Caso você declare uma variável DENTRO DE UM MÉTODO, o escopo dessa variável está 
limitado apenas ao corpo desse método, ou seja, dentro das chaves que limitam o
método.

~~~Java
public class Conta{
    //variavel da classe conta
    double saldo = 10.0;
    
    public void sacar(Double valor){
        //variavel local de método
        double novoSaldo = saldo - valor;
    }
    public void imprimirSaldo(){
        //disponível em toda classe
        System.out.println(saldo);
        //somente o método sacar conhece esta variavel
        System.out.println(novoSaldo);
    }
    public double calcularDividaExponencial() {
        //variável local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0;
        for (int x = 1; x <= 5; x++) {
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }
        //escopo de fluxo
        return valorMontante;
    }
}
~~~
---

### Palavras reservadas

São identificadores de uma linguagem que já possuem uma finalidade específica, portanto
não podem ser utilizados para nomear veriáveis, classes, métodos ou atributos.

A linguagem Java possui 52 palavras reservadas.

<img src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-d55c8e2cee24f556c8be85dcfbba3022ad042ab4%2Fimage%20(10)%20(1)%20(1)%20(1)%20(1)%20(1).png?alt=media"/>

---
**Controle de pacotes**

**import**: importa pacotes ou classes para dentro do código

**package**: especifica a que pacote todas as classesde um arquivo pertencem

---
**Modificadores de acesso**

**public**: acesso de qualquer classe

**private**: acesso apenas dentro da classe

**protected**: acesso por classes no mesmo pacote e subclasses

---