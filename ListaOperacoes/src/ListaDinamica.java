public class ListaDinamica implements ListaOperacoes {


    No inicio;

    public ListaDinamica() {
        this.inicio = new No(null);
        System.out.println("Lista Dinâmica criada com sucesso!");
    }

    public void adicionar(String elemento) {
        No novoNo = new No(elemento);

        if (inicio == null) {
            inicio = novoNo;
        } else {
            No aux = inicio;
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(novoNo);
        }
    }


    private boolean existeInicio() {
        if(this.inicio.getConteudo() == null) {
            return false;
        } else {
            return true;
        }
    }


    @Override
    public int contar() {
        int contador = 0;
        No aux = this.inicio;
        while (aux != null) {
            contador++;
            aux = aux.getProx();
        }
        return contador;
        }

    @Override
    public int adicionarVarios(String[] elementos) {
        return 0;
    }

    @Override
    public String obter(int indice) {
        return "";
    }

    @Override
    public boolean inserir(int indice, String elemento) {
        return false;
    }

    @Override
    public String removerPorIndice(int indice) {
        return "";
    }

    @Override
    public void limpar() {

    }

    @Override
    public int ultimoIndiceDe(String elemento) {
        return 0;
    }

    @Override
    public int contarOcorrencias(String elemento) {
        return 0;
    }
}
