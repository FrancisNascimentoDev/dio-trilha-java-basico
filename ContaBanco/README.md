
# dio-trilha-java-basico

# **Projeto ContaBanco**

## **1. Descrição do Projeto**
O projeto **ContaBanco** é um programa simples em Java que permite a criação de uma conta bancária via terminal. O usuário é solicitado a inserir informações como número da conta, número da agência, nome do cliente e saldo disponível. Após a coleta dessas informações, o programa exibe uma mensagem formatada com os dados da conta bancária, confirmando que a conta foi criada com sucesso.

## **2. Funcionalidades**
O programa implementa as seguintes funcionalidades básicas:
- Recebe o número da conta bancária (inteiro).
- Recebe o número da agência bancária (string).
- Recebe o nome completo do cliente (string).
- Recebe o saldo disponível da conta (decimal).
- Exibe uma mensagem de boas-vindas com os dados da conta bancária do cliente.

## **3. Estrutura do Projeto**
O projeto é composto por um único arquivo Java:
- **`ContaTerminal.java`**: Contém toda a lógica do programa.

### Arquivos:

ContaBanco/ │ └─── ContaTerminal.java


## **4. Regras de Declaração de Variáveis**
As variáveis do projeto foram declaradas de acordo com as necessidades do sistema bancário:

- **`numero`** (int): Armazena o número da conta bancária.
- **`agencia`** (String): Armazena o número da agência bancária.
- **`nomeCliente`** (String): Armazena o nome completo do cliente.
- **`saldo`** (double): Armazena o saldo disponível da conta.

## **5. Detalhes da Implementação**

### Classe `ContaTerminal`

A classe principal do projeto é responsável por:
- Capturar as informações de entrada do usuário via terminal utilizando a classe `Scanner`.
- Armazenar essas informações em variáveis apropriadas.
- Exibir uma mensagem formatada que confirma a criação da conta bancária.

**Exemplo de Execução:** 

```bash 
Por favor, digite o número da conta:
1021
Por favor, digite o número da agência:
067-8
Por favor, digite o nome do cliente:
LUIS SILVA
Por favor, digite o saldo da conta:
538.87

Olá LUIS SILVA , obrigado por criar uma conta em nosso banco.
Sua agência é 067-8, conta número 1021 e seu saldo de R$ 538.87 já está disponível para saque.

```

## **6. Como Executar o Projeto**

### **Pré-requisitos:**
- JDK (Java Development Kit) instalado.
- Um terminal ou IDE (como Eclipse, IntelliJ IDEA ou VSCode) para rodar o código Java.

### **Passos para execução:**

1. **Clonar ou criar o projeto:**  
   Crie a pasta do projeto com o nome **ContaBanco** e insira o arquivo `ContaTerminal.java` com o código fornecido.

2. **Compilar o projeto:**  
   Abra um terminal, navegue até a pasta do projeto e compile o arquivo Java com o seguinte comando:
   ```bash
   javac ContaTerminal.java
3. **Executar o projeto:**
Após a compilação, execute o programa com o comando:
```bash
   java ContaTerminal
```
4. **Interaja com o programa:**
O programa solicitará as informações da conta e exibirá uma mensagem com os dados fornecidos.





