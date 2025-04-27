package br.fastfood.app;

import br.fastfood.facade.ComboFacade;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== Menu de Combos ===");
        System.out.println("1 – Combo Master");
        System.out.println("2 – Super Combo");
        System.out.print("Sua escolha: ");

        int escolha;
        do {
            System.out.print("Sua escolha (1 ou 2): ");
            escolha = in.nextInt();
            if (escolha != 1 && escolha != 2) {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 1 && escolha != 2);

        ComboFacade facade = new ComboFacade();
        facade.criarCombo(escolha);
        facade.exibirItens();
        System.out.printf("Total a pagar: R$ %.2f%n", facade.getPrecoTotal());

        in.close();
    }
}
