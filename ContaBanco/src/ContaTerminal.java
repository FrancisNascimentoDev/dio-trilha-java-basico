import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criação do Scanner para ler os dados via terminal
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Coletando os dados do usuário
        System.out.println("Por favor, digite o número da conta:");
        numero = scanner.nextInt();  // Coleta um valor inteiro para o número da conta

        System.out.println("Por favor, digite o número da agência:");
        agencia = scanner.next();  // Coleta um valor String para a agência

        System.out.println("Por favor, digite o nome do cliente:");
        scanner.nextLine(); // Limpa o buffer de leitura
        nomeCliente = scanner.nextLine();  // Coleta um valor String para o nome do cliente

        System.out.println("Por favor, digite o saldo da conta:");
        saldo = scanner.nextDouble();  // Coleta um valor decimal (double) para o saldo

        // Exibição da mensagem final com as informações fornecidas
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta número " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque.");

        // Fecha o Scanner
        scanner.close();
    }
}
