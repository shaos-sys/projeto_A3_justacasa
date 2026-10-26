package view;

import java.util.Scanner;

public class Menu {
 Scanner scan = new Scanner(System.in, "CP850");   
    public void menuPrincipal(){
       System.out.println("================ JUSTA CASA ================"); 
       System.out.println("[1] Adicionar moradores");
       System.out.println("[2] Adicionar despesas fixas");
       System.out.println("[3] Adicionar despesas variáveis");
       System.out.println("[4] Exibir despesas fixas");
       System.out.println("[5] Exibir despesas variáveis");
       System.out.println("[6] Sair");      
    }

    public int escolhaOpcao () {  
      System.out.print("Escolha uma opção: ");

      int opcao = scan.nextInt();
      scan.nextLine();

    return opcao;  
    }
}
