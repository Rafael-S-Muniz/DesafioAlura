import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("        Digite a operação desejada: \n" +
                "        1- Consultar saldos\n" +
                "        2- Depositar valor\n" +
                "        3- Transferir valor\n" +
                "        4- Sair\n" +
                "\n");

        String nomeDoCliente = "Rafael Muniz";
        String conta = "Conta Corrente";
        int operacao = scanner.nextInt();
        double saldo = 0;

        while (operacao != 4)
        {if (operacao == 1) {
            System.out.println("O Seu saldo é de: " + saldo);

            System.out.println("        Digite a operação desejada: \n" +
                    "        1- Consultar saldos\n" +
                    "        2- Depositar valor\n" +
                    "        3- Transferir valor\n" +
                    "        4- Sair\n" +
                    "\n");
            operacao = scanner.nextInt();
        } else if (operacao == 2) {
            System.out.println("Qual valor gostaria de depositar?");
            double deposito = scanner.nextDouble();
            System.out.println("Tem certeza que deseja depositar esse valor? Sim/Não.");
            String resposta = scanner.next();
            if (resposta.equals("Sim")) {
                saldo += deposito;
                System.out.println("Valor depositado com sucesso!");
                System.out.println("        Digite a operação desejada: \n" +
                        "        1- Consultar saldos\n" +
                        "        2- Depositar valor\n" +
                        "        3- Transferir valor\n" +
                        "        4- Sair\n" +
                        "\n");
                operacao = scanner.nextInt();
            } else if (resposta.equals("Não")) {
                System.out.println("Qual valor gostaria de depositar?");
                double valor = scanner.nextDouble();
                saldo += valor;
                System.out.println("Valor depositado com sucesso");
                System.out.println("        Digite a operação desejada: \n" +
                        "        1- Consultar saldos\n" +
                        "        2- Depositar valor\n" +
                        "        3- Transferir valor\n" +
                        "        4- Sair\n" +
                        "\n");
                operacao = scanner.nextInt();
            } else if (operacao == 3) {
                System.out.println("Para qual conta gostaria de transferir?");
                String account = scanner.next();
                System.out.println("Qual o valor que gostaria de depositar?");
                double valor = scanner.nextDouble();
                if (valor > saldo) {
                    System.out.println("Você não tem esse valor para transferir");
                } else if (valor <= saldo) {
                    saldo -= valor;
                    System.out.println("Valor transferido com sucesso para a conta: " + account);
                } else if (operacao != 1 || operacao != 2 || operacao != 3 || operacao != 4) {
                    System.out.println("Opção inválida, tente novamente");
                }
            } if (operacao == 4) {
                System.out.println("Agradecemos a preferência, volte sempre!");

        }
    }
}}}

