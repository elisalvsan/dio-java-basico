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

