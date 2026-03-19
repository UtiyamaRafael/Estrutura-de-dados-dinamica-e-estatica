public class Main{

  static void main() {

    FilaSimples fs = new FilaSimples(3);

    fs.enfileirar(1);
    fs.enfileirar(2);
    fs.enfileirar(3);
    fs.exibir();
    System.out.println("-------------------");
    fs.desenfileirar();
    fs.exibir();

  }
}