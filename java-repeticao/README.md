# Estruturas de repetições

    Laços de repetição, também conhecidos como laços de interação ou simplesmente loops, são comandos que
    permitem interações de código, ou seja, que comandos  presentes no bloco sejam repetidos diversas vezes.
    
LINK: [Laços de repetição](https://diegomariano.com/lacos-de-repeticao-2)

Laços ou repetição são representados pelas seguintes estruturas: 

- **For** (para)
- **While** (enquanto)
- **Do While** (faça enquanto)

---

## For

O comando **for** (na tradução para a língua portugusa "para") permite que uma variável contadora seja testada e incrementada a cada iteração, sendo essas informações definidas na chamda do comando. O comando for recebe como entrada uma variável contadora, a condição e o valor incrementarão.

A estrutura de sintaxe do controle de repetição **for** é exibida abaixo:

```
//estrutura do controle de fluxo for

for(bloco de inicialização; expressão booleana de validação; bloco de atualização){
    
    // comando que será executado até que a
    // expressão de validação torne-se falsa
    
}
```
- Exemplo de for: 
```Java
public class ExemploFor {

    public static void main(String[] args) {
        for (int carneirinhos  = 1; carneirinhos <= 20; carneirinhos++){
            System.out.println(carneirinhos + " carneirinho\n");
        }

        System.out.println("dormindo zzz...");
    }
}
```

---
## For com Arrays

Também usamos o controole de fluxo **for** para interagir sobre arrays e coleções:

- Exemplo de For com array

```Java
public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x=0; x<alunos.length; x++){
            System.out.println("O aluno no indicce x = " + x + " é " + alunos[x]);
        }

    }
}
```

### For Each

O uso do **for / each** está fortemente relacionado com um cenário onde contenha um array ou coleção, e assim, a interação é baseada aos elements da coleção.

 - Exemplo de for each: 
```Java
public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
        
        for (String aluno: alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }

    }
}
```
---

## Break e Continue
**Break** significa quebrar, parar, frear, interromper. E é isso que se faz quando o Java encontra esse coomando pela frente. 

**Continue**, como o nome diz, ele 'continua' o laço. O comando **break** interrompe o laço, já o **continue** interrompe somente a iteração atual.

- Exemplo break:
```Java
public class ExemploBreakContinue {
    public static void main(String[] args) {

        for (int numero =1; numero <= 5; numero++){
            if (numero==3)
                break;

            System.out.println(numero);
        }
    }
}
```

- Exemplo continue:
```Java
public class ExemploBreakContinue {
    public static void main(String[] args) {

        for (int numero =1; numero <= 5; numero++){
            if (numero==3)
                continue;

            System.out.println(numero);
        }
    }
}
```
---

## While
O laço **while** (na tradução literal pra a língua portuguesa "enquanto") determina que enquanto uma condição for válida, o bloco de código será executado. O laço **while** testa a condição antes de executar o código, logo, caso a condição seja inválida no primeiro teste o bloco nem será executado.

A estrutura de sintaxe do controle de repetição **while** é exibida abaixo:

```
 //estrutura do controle de fluxo while
 
 while(expressão booleana de validação){
    //comando que será executado até que a
    //expressão de validação torne-se falsa
 }
```
- Exemplo de while:
```Java
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {

    public static void main(String[] args) {

        double mesada = 50.0;
        while(mesada>0){

            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada){
                valorDoce = mesada;
            }
            System.out.println("Valor do doce: " + String.format("%.2f", valorDoce) + " - Adicionado no carrinho");
            mesada -= valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces.");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
```

## Do While

O laço **do / while** (na tradução literal para a língua portuguesa "faça... enquanto"), assim como o laço **while**, considera que enquanto uma determida condição for válida o bloco de código será executado. Entretanto, **do / while** testa a condição após executar o código, sendo assim, mesmo que a condição seja considerada inválida no primeiro teste o bloco será executado pelo menos uma vez.

A estrutura de sintaxe do controle de repetição **do / while** é exibida abaixo:

```
    //estrutura do controle de fluxo do while
    
    do{
        //comando que será executado até que a
        //expressão de validação torne-se falsa
    }
    while(expressão booleana de validação);
```

- Exemplo de Do While: 

```Java

```