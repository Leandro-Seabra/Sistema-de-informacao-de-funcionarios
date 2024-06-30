package com.sistemamgs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Obter Informações do Funcionário");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                System.out.print("Digite o ID: ");
                String id = scanner.nextLine();
                System.out.print("Digite o Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Digite as Alergias: ");
                String alergias = scanner.nextLine();
                System.out.print("Digite as Condições Médicas: ");
                String condicoesMedicas = scanner.nextLine();
                System.out.print("Digite o Telefone de Contato de Emergência: ");
                String telefoneContatoEmergencia = scanner.nextLine();
                System.out.print("Digite o Email de Contato de Emergência: ");
                String emailContatoEmergencia = scanner.nextLine();

                Funcionario funcionario = new Funcionario(id, nome, alergias, condicoesMedicas, telefoneContatoEmergencia, emailContatoEmergencia);
                sistema.adicionarFuncionario(funcionario);

            } else if (escolha == 2) {
                System.out.print("Digite o ID do Funcionário: ");
                String id = scanner.nextLine();
                sistema.exibirInformacoesFuncionario(id);

            } else if (escolha == 3) {
                break;

            } else {
                System.out.println("Escolha inválida. Por favor, tente novamente.");
            }
        }

        scanner.close();
    }
}
