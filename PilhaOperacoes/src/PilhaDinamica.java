public class PilhaDinamica<T> {

    No<T> inicio;

    public PilhaDinamica() {
        this.inicio = new No<T> (null);
        System.out.println("Pilha Dinamica criada com sucesso!");
    }


    public void empilhar(T elemento) {
        No<T> novo = new No<>(elemento);
        novo.setProx(inicio);
        inicio = novo;
    }

    public void desempilhar() {

        if (inicio == null) {
            System.out.println("Pilha vazia");
            return;
        }

        inicio = inicio.getProx();
    }

    public void exibir(){
        No<T> aux = this.inicio;
        while (aux.getProx() != null) {
            System.out.println(aux.getConteudo());
            aux = aux.getProx();
        }
    }

}
