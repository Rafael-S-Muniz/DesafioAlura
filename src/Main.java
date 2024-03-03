import org.w3c.dom.ls.LSOutput;

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
        int operacao = scanner.nextInt();

        String nomeDoCliente = "Rafael Muniz";
        String conta = "Conta Corrente";
        double saldo = 0;

        while (operacao != 4) {
            if (operacao == 1) {
                System.out.println("O Seu saldo é de: " + saldo);
            } else if (operacao == 2) {
                System.out.println("Qual valor gostaria de depositar?");
                double deposito = scanner.nextDouble();
                if (deposito >= 0) {
                    System.out.println("Tem certeza que deseja depositar esse valor? Sim/Não.");
                }
                String resposta = scanner.next();
                while (resposta.equals("Não")) {
                    System.out.println("Qual valor gostaria de depositar?");
                    deposito = scanner.nextDouble();
                    if (deposito >= 0) {
                        System.out.println("Tem certeza que deseja depositar esse valor? Sim/Não.");
                        resposta = scanner.next();

                    } else {
                        System.out.println("Valor inválido, tente novamente");
                    }
                }
                if (resposta.equals("Sim")) {
                    saldo += deposito;
                    System.out.println("Valor depositado com sucesso!");
                }
            }
            else if (operacao == 3) {
                System.out.println("Para qual conta gostaria de transferir?");
                String account = scanner.next();
                System.out.println("Qual o valor que gostaria de transferir?");
                double valor = scanner.nextDouble();
                if (valor >= 0) {
                    if (valor > saldo) {
                        System.out.println("Você não tem esse valor para transferir");

                    } else if (valor <= saldo) {
                        saldo -= valor;
                        System.out.println("Valor transferido com sucesso para a conta: " + account);
                    }
                }
            } else {
                System.out.println("Operação inválida, tente novamente.");
            }

            System.out.println("        Digite a operação desejada: \n" +
                    "        1- Consultar saldos\n" +
                    "        2- Depositar valor\n" +
                    "        3- Transferir valor\n" +
                    "        4- Sair\n" +
                    "\n");
            operacao = scanner.nextInt();
        }
        System.out.println("Obrigado pela preferência, volte sempre.");
    }
}




