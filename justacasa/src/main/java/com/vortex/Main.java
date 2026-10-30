package com.vortex;

import java.util.Scanner;

import model.Morador;
import service.DespesaFixa;
import service.DespesaVariavel;
import view.Menu;

public class Main {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in, "CP850");

     Menu menu = new Menu();
     Morador morador = new Morador();
     DespesaFixa despesaFixa = new DespesaFixa();
     DespesaVariavel despesaVariavel = new DespesaVariavel();

        int opcao = 0;

        menu.menuPrincipal();
        opcao = menu.escolhaOpcao();

        while (opcao != 6) {
            switch (opcao) {
                case 1:
                    morador.adicionarMorador();
                    menu.menuPrincipal();
                    opcao = menu.escolhaOpcao();
                    break;

                case 2:
                    despesaFixa.adicionarDespesa();
                    menu.menuPrincipal();
                    opcao = menu.escolhaOpcao();
                    break;

                case 3:
                    despesaVariavel.adicionarDespesa();
                    menu.menuPrincipal();
                    opcao = menu.escolhaOpcao();
                    break;

                case 4:
                    despesaFixa.exibirDespesa();
                    menu.menuPrincipal();
                    opcao = menu.escolhaOpcao();
                    break;

                case 5:
                    despesaVariavel.exibirDespesa();
                    menu.menuPrincipal();
                    opcao = menu.escolhaOpcao();
                    break;

                default:
                    System.out.println("Opção inválida!");

                    break;
            }
        }
        System.out.println("Encerrando...");
        scan.close();
    }
}