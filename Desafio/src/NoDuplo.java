public class NoDuplo {

    String conteudo;
    NoDuplo prox;
    NoDuplo ant;

    public NoDuplo(String conteudo) {
        this.conteudo = conteudo;
        this.prox = null;
        this.ant = null;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo getProx() {
        return prox;
    }

    public void setProx(NoDuplo prox) {
        this.prox = prox;
    }

    public NoDuplo getAnt() {
        return ant;
    }

    public void setAnt(NoDuplo ant) {
        this.ant = ant;
    }
}
