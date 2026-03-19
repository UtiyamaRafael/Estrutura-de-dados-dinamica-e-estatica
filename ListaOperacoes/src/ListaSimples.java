public class ListaSimples implements ListaOperacoes{

    String[] lista;

    public ListaSimples(int tamanho) {
        this.lista = new String[tamanho];
    }

    public void exibirElementos() {
        for (int i = 0; i < this.lista.length; i++) {
            System.out.println("Lista[" + i + "] = " + this.lista[i]);
        }
    }

    public void adicionarElemento(String elemento) {
        if (!estaCheia()) {
            this.lista[encontrarPosicaoVazia()] = elemento;
            System.out.println("Elemento " + elemento + " adicionado com sucesso!");
        }
    }

    private boolean estaCheia() {
        for (int i = 0; i < this.lista.length; i++) {
            if (this.lista[i] == null) {
                return false;
            }
        }
        System.out.println("A lista está cheia!");
        return true;
    }

    private int encontrarPosicaoVazia() {
        int i;
        for (i = 0; i < this.lista.length; i++) {
            if (this.lista[i] == null) {
                return i;
            }
        }
        return i;
    }

    public int removerTodas (String elemento){
        int contador = 0;
        if (estaVazia()){
            System.out.println("Esta vazia");
            return 0;
        }else {
            for (int i = 0; i < lista.length; i++){
                if (lista[i] != null && lista[i].equals(elemento)){
                    lista[i] = null;
                    contador++;
                }
            }
        }
        System.out.println("Foram removidos "+contador+" elemento(s)");
        return contador;
    }

    private boolean estaVazia() {
        for (String elemento : lista) {
            if (elemento != null) {
                return false;
            }
        }
        return true;
    }

    public int contar(){
        int contador = 0;
        for (int i = 0; i < lista.length; i++){
            if (lista[i] != null){
                contador++;
            }
        }
        System.out.println(contador+" elementos");
        return contador;
    }

    public int adicionarVarios(String[] elementos){
        int contador = 0;
        if (estaCheia()){
            System.out.println("Esta cheia");
            return 0;
        }else  {
            for (int i = 0; i < lista.length && contador < elementos.length; i++){
                if (lista[i] == null ){
                    lista[i] = elementos[contador];
                    contador++;
                }
            }
        }
        return contador;
    }

    public String obter(int indice){
        if (indice < 0 || indice >= lista.length){
            return null;
        }else  {
            return lista[indice];
        }
    }

    public boolean inserir(int indice, String elemento){
        if (estaCheia()){
            System.out.println("Esta cheia");
            return false;
        }
        if (lista[indice] == null){
            lista[indice] = elemento;
            return true;
        }else {
            organizarVetor();
            for (int i = lista.length-1; i > indice; i--){
                lista[i] = lista[i-1];
            }
            lista[indice] = elemento;

        }
        return true;
    }

    private void organizarVetor() {
        for (int i = 0; i < lista.length - 1; i++) {
            if (lista[i] == null) {
                for (int j = i; j < lista.length - 1; j++) {
                    lista[j] = lista[j + 1];
                }
                lista[lista.length - 1] = null;
                i--;
            }
        }
    }

    public String removerPorIndice(int indice){
        if (indice < 0 || indice >= lista.length){
            return null;
        }
        String aux = lista[indice];
        lista[indice] = null;
        for (int i = indice; i < lista.length - 1; i++) {
            lista[i] = lista[i + 1];

        }
        lista[lista.length - 1] = null;
        return aux;
    }

    public void limpar(){
        for (int i = 0; i < lista.length; i++){
            lista[i] = null;
        }
    }

    public int ultimoIndiceDe(String elemento){
        int indice = -1;
        for (int i = 0; i < lista.length; i++){
            if (lista[i] != null && lista[i].equals(elemento)){
                indice = i;
            }
        }
        if (indice == -1){
            return -1;
        }else return indice;
    }

    public int contarOcorrencias(String elemento){
        int contador = 0;
        for (int i = 0; i < lista.length; i++){
            if (lista[i] != null && lista[i].equals(elemento)){
                contador++;
            }
        }
        return contador;
    }

    public  int substituir(String antigo, String novo){
        int contador = 0;
        for (int i = 0; i < lista.length; i++){
            if (lista[i] != null && lista[i].equals(antigo)){
                lista[i] = novo;
                contador++;
            }
        }
        return contador;
    }

}
