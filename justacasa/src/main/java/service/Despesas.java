package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Despesas {
    Scanner scanner = new Scanner(System.in, "CP850");
    private Map<String, Double> despesa = new HashMap<>();

    public void adicionarDespesa(String nomeDespesa, double valorDespesa, Scanner scanner){
      try {
        System.out.println("Adicione despesas fixas:");
         System.out.print("Descrição:");
          nomeDespesa = scanner.nextLine();
         System.out.println("Valor da despesa fixa:");
          valorDespesa = scanner.nextDouble();
        despesa.put(nomeDespesa, valorDespesa);
      } catch (Exception e) {
        System.out.println(e);
      }
    }

}
