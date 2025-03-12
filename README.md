# Tarefa_Stream

## Descrição

Esta branch contém a implementação do exercício que envolve a filtragem de uma lista de pessoas, separando as mulheres, utilizando **expressões lambda** e o método **`filter()`** da API Stream do Java.

### O que foi feito:
- Foi criada uma lista de **pessoas** com seus respectivos nomes e sexos.
- Utilizamos **expressões lambda** junto com o método **`filter()`** para filtrar somente as mulheres da lista.
- Foi implementado um **`if-else`** dentro da expressão lambda para verificar o sexo das pessoas.
- As mulheres filtradas foram impressas no console, e uma mensagem de erro é exibida caso não haja mulheres na lista.

## Como rodar o código

1. Clone este repositório:
    ```bash
    git clone <url_do_repositório>
    ```

2. Navegue até a pasta do projeto:
    ```bash
    cd Tarefa_Stream_md22
    ```

3. Compile o código Java:
    ```bash
    javac Pessoa.java Main.java
    ```

4. Execute o código:
    ```bash
    java Main
    ```

5. O código exibirá a lista de mulheres cadastradas ou uma mensagem informando que nenhuma mulher foi cadastrada.

## Funcionalidade

- **Entrada**: Uma lista de pessoas com seus nomes e sexos.
- **Saída**: A lista de mulheres cadastradas será exibida no console, com o nome e o sexo de cada uma.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação.
- **API Stream**: Para manipulação de listas e filtragem com **expressões lambda**.

## Notas

Este exercício faz parte de um estudo sobre como utilizar expressões lambda em Java para manipulação de coleções, aplicando a técnica de filtragem usando **streams**.

Se houver dúvidas ou sugestões, fique à vontade para abrir uma **issue**.


