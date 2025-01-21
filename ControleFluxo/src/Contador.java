import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Recebe os dois parâmetros via terminal
            System.out.println("Digite o primeiro número (início): ");
            int numero1 = scanner.nextInt();

            System.out.println("Digite o segundo número (fim): ");
            int numero2 = scanner.nextInt();

            // Verifica se o primeiro parâmetro é maior que o segundo
            if (numero1 > numero2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            // Laço de repetição para imprimir os números incrementados
            for (int i = numero1; i <= numero2; i++) {
                System.out.println("Imprimindo o número " + i);
            }

        } catch (ParametrosInvalidosException e) {
            // Trata a exceção personalizada
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            // Trata outras exceções
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
