public class DesafioLista {

    NoDuplo inicio;

    public DesafioLista() {
        this.inicio = null;
    }

    public void adicionar(String elemento) {

        NoDuplo aux_novo = new NoDuplo(elemento);
        if (estaVazio()){
            this.inicio = aux_novo;
            return;
        }

        NoDuplo aux = this.inicio;
        while (aux.getProx() != null) {
            aux = aux.getProx();
        }

        aux.setProx(aux_novo);
        aux_novo.setAnt(aux);
    }

    public void exibir() {
        NoDuplo aux = this.inicio;

        while (aux != null) {
            System.out.println(aux.getConteudo());
            aux = aux.getProx();
        }
    }


    private boolean estaVazio() {
        if (this.inicio == null) {
            return true;
        }else return false;
    }
}
