import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      try {
        System.out.println("Por favor, digite o código o número da Agência:");
        String agencia = input.nextLine();

        System.out.println("Digite o número da Conta:");
        int numero = input.nextInt();

        System.out.println("Digite o nome do Cliente:");
        String nomeCliente = input.nextLine();
        input.next();

        System.out.println("Digite o saldo");
        double saldo = input.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);

      } catch (Exception e) {
        System.out.println("Falha na leitura dos dados. Por favor, tente novamente!");
        System.out.printf("Erro: %s", e.getMessage());
      }
    }
}