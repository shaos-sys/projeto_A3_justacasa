package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Morador {
 Scanner scanner = new Scanner(System.in, "CP850");   

    private String nomeMorador;
    private List<String> moradores = new ArrayList<>();

    public void adicionarMorador(){
       do {
       System.out.println("Adicione o nome de um morador (ou 'N' para sair).");
       nomeMorador = scanner.nextLine();
                   
       if (!nomeMorador.equalsIgnoreCase("N")) {
        moradores.add(nomeMorador);
       }
      } while (!nomeMorador.equalsIgnoreCase("N"));
    }      
}
