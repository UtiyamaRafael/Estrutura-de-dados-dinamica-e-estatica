public class FilaSimples {

    Integer[] fila;

    public FilaSimples(int tamanho){
        fila = new Integer[tamanho];
    }

    public void enfileirar(int numero){
        if (estaCheia()){
            return;
        }else {
            for(int i = 0 ; i < fila.length ; i++){
                if (this.fila[i] == null){
                    this.fila[i] = numero;
                    System.out.println("O número " + numero + " foi inserido com sucesso.");
                    return;
                }
            }
        }
    }

    private boolean estaCheia(){
        if(this.fila[this.fila.length-1] != null){
            return true;
        }else {
            return false;
        }
    }

    public void desenfileirar(){
        if (!estaVazio()){
            for(int i = 0; i < this.fila.length-1; i++){
                if (this.fila[i] != null){
                    this.fila[i] = this.fila[i+1];
                }else {
                    return;
                }
            }
            this.fila[this.fila.length-1] = null;
        }
    }

    private boolean estaVazio(){
        if (fila[0] == null){
            return true;
        }else {
            return false;
        }
    }

    public void exibir(){
        for (int i = 0; i < this.fila.length; i++){
            System.out.println(this.fila[i]);
        }
    }

}
