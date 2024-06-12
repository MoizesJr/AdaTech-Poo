package main;

import java.util.Scanner;

import implementation.SuperMarket;
import implementation.SuperMarketArray;

public class Main {

  private static int SIZE = 3;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    SuperMarket superMarket = new SuperMarketArray(SIZE);
    int opcao;

    do {
      System.out.println("\nLista de compras:");
      System.out.println("1 - Inserir ");
      System.out.println("2 - Listar");
      System.out.println("3 - Remover");
      System.out.println("4 - Sair");
      System.out.println("Escolha uma opção: ");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          System.out.println("Digite o item a ser inserido: ");
          String item = scanner.next();
          superMarket.add(item);
          break;
        case 2:
          superMarket.print();
          break;
        case 3:
          System.out.println("Digite a posição do item a ser removido: ");
          int index = scanner.nextInt();
          superMarket.delete(index);
          break;
        case 4:
          System.out.println("Saindo do programa: ");
          break;

        default:
          System.out.println("Opção invalida!! Escolha novamente");

      }
    } while (opcao != 4);

    scanner.close();
  }
}
