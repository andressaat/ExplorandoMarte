# ExplorandoMarte

## Compilar o projeto

```sh
 # -d diz ao compilador o local onde colocar os arquivos .class compilados
 # -cp Especifica onde encontrar arquivos de classe
 # src/explorandomarte/*.java  diz ao compilador para compilar todos os arquivos .java em src/explorandomarte

 javac -d classes -cp classes src/explorandomarte/*.java

 # para rodar

 java -cp classes explorandomarte.ExplorandoMarte

 # Também é possivel compilar atravez no netbeans

```
## Exemplo de movimentação que leva a um local já ocupado
```sh
$ 55
$ 12N
$ LM LM LM LM M 
$ 24s
$ rmlm # movimento que leva a uma posição já ocupada
$ Entrada invalida! Ja existe uma sonda neste local $ !!! Tente novamente.
$ lmlmlmm
$ 33e
$ MMR MMR MRR M
```
## Declarando uma sonda em um local ja ocupado
```sh
$ 55
$ 12N
$ lrlrlrlr
$ 12N # Declaração de sonda em uma posição já ocupada
$ Entrada invalida! Ja existe uma sonda neste local !!! Tente novamente.

```
## Testando a aplicação
```sh
$ 5 5
$ 1 2 N
$ LMLMLMLMM
$ 3 3 E
$ MMRMMRMRRM
```
## Saida esperada
```sh
$ 1 3 N
$ 5 1 E
```