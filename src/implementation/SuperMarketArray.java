package implementation;

public class SuperMarketArray implements SuperMarket {

  private int lastIndex;

  private final String[] itens;

  public SuperMarketArray(final int size) {
    itens = new String[size];
    lastIndex = -1;
  }

  @Override
  public void add(String item) {
    if (lastIndex == itens.length - 1) {
      System.err.println("Lista cheia");
    } else {
      lastIndex++;
      itens[lastIndex] = item;
    }
  }

  @Override
  public void delete(int index) {
    if (index >= 0 && index <= lastIndex) {
      shit(index);
      lastIndex--;
    } else {
      System.err.println("Indice invalido: " + index);
    }
  }

  private void shit(final int index) {
    for (int i = index; i < lastIndex; i++) {
      itens[i] = itens[i + 1];
    }
  }

  @Override
  public void print() {
    System.out.println("**********************************************************");
    if (lastIndex < 0) {
      System.out.println("Lista vazia");
    }
    for (int i = 0; i < lastIndex; i++) {
      System.out.println(i + " - " + itens[i]);
    }
    System.out.println("**********************************************************");
  }

}
