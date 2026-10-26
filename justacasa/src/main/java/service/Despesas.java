package service;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Despesas {
    Scanner scanner = new Scanner(System.in, "CP850");
    private Map<String, Double> despesa = new HashMap<>();
    private String descDespesa;
    private double valorDespesa;

    protected String titulo() {
        return "Adicionar despesa:";
    }

    protected String tituloExibirDespesas(){
        return "================ DESPESAS ================";
    }

    public void adicionarDespesa() {
        do {
            System.out.println("Adicionar despesa ('N' para voltar)");
            System.out.println(titulo());
            System.out.print("Descição: ");
            descDespesa = scanner.nextLine();

            if (descDespesa.equalsIgnoreCase("N")) {
                return;
            }

            boolean valido = false;
            while (!valido) {
                System.out.print("Valor: ");
                try {
                    valorDespesa = scanner.nextDouble();
                    if (valorDespesa <= 0) {
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

            despesa.put(descDespesa, valorDespesa);

        } while (true);
    }

    public void exibirDespesa() {
        System.out.println(tituloExibirDespesas());

        if (despesa.isEmpty()) {
          System.out.println("Nenhuma despesa cadastrada.");
          return;
        }

        for (Map.Entry<String, Double> item : despesa.entrySet()) {
         System.out.printf("%s: R$ %.2f%n",
            item.getKey(),
            item.getValue());
        }
    }

    public Map<String, Double> getDespesa() {
        return despesa;
    }
}
