package service;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class DespesaVariavel implements DespesaController {
 Scanner scanner = new Scanner(System.in, "CP850");

  private Map<String, Double> despesaVariavel = new HashMap<>();
  private String descDespesaVariavel;
  private double valorDespesaVariavel;

    @Override
    public void adicionarDespesa() {
        do {
            System.out.println("Adicionar despesa ('N' para voltar)");
            System.out.println("================ DESPESAS VARIÁVEL ================");
            System.out.print("Descição: ");
            descDespesaVariavel = scanner.nextLine();

            if (descDespesaVariavel.equalsIgnoreCase("N")) {
                return;
            }

            boolean valido = false;
            while (!valido) {
                System.out.print("Valor: ");
                try {
                    valorDespesaVariavel = scanner.nextDouble();
                    if (valorDespesaVariavel <= 0) {
                        System.out.println("O valor deve ser maior que zero.");
                    } else {
                        valido = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Valor inválido. Digite um número, ex.: 150,50");
                } finally {
                    scanner.nextLine();
                }
            }

            despesaVariavel.put(descDespesaVariavel, valorDespesaVariavel);

        } while (true);

    }

    @Override
    public void exibirDespesa() {
        System.out.println("================ DESPESAS VARIÁVEL ================");

        if (despesaVariavel.isEmpty()) {
            System.out.println("Nenhuma despesa cadastrada.");
            return;
        }

        for (Map.Entry<String, Double> item : despesaVariavel.entrySet()) {
            System.out.printf("%s: R$ %.2f%n",
                    item.getKey(),
                    item.getValue());
        }

    }

}
