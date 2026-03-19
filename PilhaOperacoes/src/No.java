public class No<T> {
    T conteudo;
     No<T> prox;

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.prox = null;
    }

    public No<T> getProx() {
        return prox;
    }

    public void setProx(No<T> prox) {
        this.prox = prox;
    }

    public T getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
}
