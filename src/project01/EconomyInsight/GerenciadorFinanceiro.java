package project01.EconomyInsight;

import java.util.Scanner;

public class GerenciadorFinanceiro {

    private static final int CAPACIDADE_MAXIMA = 50;
    public static double SomaDespesas;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] descricoesDespesas = new String[CAPACIDADE_MAXIMA];
        double[] valoresDespesas = new double[CAPACIDADE_MAXIMA];
        int totalDespesas = 0;

        String[] descricoesDividas = new String[CAPACIDADE_MAXIMA];
        double[] valoresDividas = new double[CAPACIDADE_MAXIMA];
        int totalDividas = 0;

        String continuar;

        // ==========================
        // Cadastro de Despesas
        // ==========================
        do {

            if (totalDespesas >= CAPACIDADE_MAXIMA) {
                System.out.println("\nLimite máximo de despesas atingido!");
                break;
            }

            System.out.print("Descrição da despesa: ");
            descricoesDespesas[totalDespesas] = scanner.nextLine();

            do {
                System.out.print("Informe o valor da despesa: R$ ");
                valoresDespesas[totalDespesas] = scanner.nextDouble();

                if (valoresDespesas[totalDespesas] < 0) {
                    System.out.println("O valor não pode ser negativo.");
                }

            } while (valoresDespesas[totalDespesas] < 0);

            scanner.nextLine();

            totalDespesas++;

            System.out.print("Deseja adicionar outra despesa? (S/N): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("S"));

        // ==========================
        // Cadastro de Dívidas
        // ==========================
        do {

            if (totalDividas >= CAPACIDADE_MAXIMA) {
                System.out.println("\nLimite máximo de dívidas atingido!");
                break;
            }

            System.out.print("Descrição da dívida: ");
            descricoesDividas[totalDividas] = scanner.nextLine();

            do {
                System.out.print("Informe o valor da dívida: R$ ");
                valoresDividas[totalDividas] = scanner.nextDouble();

                if (valoresDividas[totalDividas] < 0) {
                    System.out.println("O valor não pode ser negativo.");
                }

            } while (valoresDividas[totalDividas] < 0);

            scanner.nextLine();

            totalDividas++;

            System.out.print("Deseja adicionar outra dívida? (S/N): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("S"));

        // ==========================
        // Cálculo dos totais
        // ==========================
        double somaDespesas = 0;
        for (int i = 0; i < totalDespesas; i++) {
            somaDespesas += valoresDespesas[i];
        }

        double somaDividas = 0;
        for (int i = 0; i < totalDividas; i++) {
            somaDividas += valoresDividas[i];
        }

        // ==========================
        // Resumo
        // ==========================
        System.out.println("\n==============================");
        System.out.println("      RESUMO FINANCEIRO");
        System.out.println("==============================");

        System.out.println("\nDespesas cadastradas:");

        if (totalDespesas == 0) {
            System.out.println("Nenhuma despesa cadastrada.");
        } else {
            for (int i = 0; i < totalDespesas; i++) {
                System.out.printf("%d - %-25s R$ %8.2f%n",
                        i + 1,
                        descricoesDespesas[i],
                        valoresDespesas[i]);
            }
        }

        System.out.printf("%nTotal de despesas: R$ %.2f%n", somaDespesas);

        System.out.println("\nDívidas cadastradas:");

        if (totalDividas == 0) {
            System.out.println("Nenhuma dívida cadastrada.");
        } else {
            for (int i = 0; i < totalDividas; i++) {
                System.out.printf("%d - %-25s R$ %8.2f%n",
                        i + 1,
                        descricoesDividas[i],
                        valoresDividas[i]);
            }
        }

        System.out.printf("%nTotal de dívidas: R$ %.2f%n", somaDividas);

        scanner.close();
    }
}