# Desafio Controle de Fluxo

Este projeto consiste em uma aplicação Java que faz uso de controle de fluxo com loops e exceções customizadas. A aplicação recebe dois números inteiros via terminal e imprime os números em um intervalo determinado. Caso o primeiro número seja maior que o segundo, o programa lança uma exceção customizada.

## Sumário

- [Funcionalidades](#funcionalidades)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Requisitos](#requisitos)
- [Instalação](#instalação)
- [Como Executar](#como-executar)
- [Classes](#classes)
  - [ParametrosInvalidosException](#parametrosinvalidosexception)
  - [Contador](#contador)
- [Exemplos de Uso](#exemplos-de-uso)
  - [Cenário 1: Entrada válida](#cenário-1-entrada-válida)
  - [Cenário 2: Entrada inválida](#cenário-2-entrada-inválida)
- [Contato](#contato)

## Funcionalidades

- **Entrada de números via terminal**: O sistema solicita dois números inteiros ao usuário.
- **Validação de entrada**: Se o primeiro número for maior que o segundo, o programa lança uma exceção customizada chamada `ParametrosInvalidosException`.
- **Impressão de números**: Quando os números são válidos, o programa imprime a sequência numérica do primeiro número ao segundo.
- **Tratamento de exceções**: A exceção customizada informa ao usuário que o segundo número deve ser maior que o primeiro.

## Estrutura do Projeto

A estrutura básica do projeto é a seguinte:

```bash
DesafioControleFluxo/
│
└── src/
    ├── Contador.java
    └── ParametrosInvalidosException.java
```
## Classes
**ParametrosInvalidosException**

A classe `ParametrosInvalidosException` é uma exceção customizada que é lançada quando o primeiro número é maior que o segundo.

**Contador**

A classe `Contador` é responsável por solicitar os números ao usuário, verificar se a entrada é válida e imprimir os números incrementados.

## Funcionalidades

- O sistema recebe dois números inteiros via terminal.
- Verifica se o primeiro número é maior que o segundo.
- Caso o primeiro número seja maior, lança a exceção customizada `ParametrosInvalidosException`.
- Se os números forem válidos, o sistema imprime os números no intervalo entre o primeiro e o segundo número (inclusive).
## Requisitos
- Java JDK 8 ou superior
- Maven (opcional)

# Exemplo de Uso

### Cenário 1: Entrada válida
**Entrada:**
```
Digite o primeiro número (início): 12
Digite o segundo número (fim): 30
```
**Saída:**
```
Imprimindo o número 12
Imprimindo o número 13
Imprimindo o número 14
...
Imprimindo o número 30
```

### Cenário 2: Entrada inválida (primeiro número maior que o segundo)
**Entrada:**
```
Digite o primeiro número (início): 30
Digite o segundo número (fim): 12
```
**Saída:**
```
Erro: O segundo parâmetro deve ser maior que o primeiro
```