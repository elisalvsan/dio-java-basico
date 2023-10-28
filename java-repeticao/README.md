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
Exemplo: 
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

Exemplo: 
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

Exemplo break:
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

Exemplo continue:
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