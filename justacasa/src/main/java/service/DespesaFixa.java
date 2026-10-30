package service;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class DespesaFixa implements DespesaController {
 Scanner scanner = new Scanner(System.in, "CP850");

    private Map<String, Double> despesaFixa = new HashMap<>();
    private String descDespesaFixa;
    private double valorDespesaFixa;

    @Override
    public void adicionarDespesa() {
        do {
            System.out.println("Adicionar despesa ('N' para voltar)");
            System.out.println("================ DESPESAS FIXA ================");
            System.out.print("Descição: ");
            descDespesaFixa = scanner.nextLine();

            if (descDespesaFixa.equalsIgnoreCase("N")) {
                return;
            }

            boolean valido = false;
            while (!valido) {
                System.out.print("Valor: ");
                try {
                    valorDespesaFixa = scanner.nextDouble();
                    if (valorDespesaFixa <= 0) {
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

            despesaFixa.put(descDespesaFixa, valorDespesaFixa);

        } while (true);
    }

    @Override
    public void exibirDespesa() {
        System.out.println("================ DESPESAS ================");

        if (despesaFixa.isEmpty()) {
            System.out.println("Nenhuma despesa cadastrada.");
            return;
        }

        for (Map.Entry<String, Double> item : despesaFixa.entrySet()) {
            System.out.printf("%s: R$ %.2f%n",
                    item.getKey(),
                    item.getValue());
        }
    }

    public Map<String, Double> getDespesaFixa() {
        return despesaFixa;
    }

}
