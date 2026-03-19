public class Main {

    static void main() {

        ListaSimples listaSimples = new ListaSimples(10);

        listaSimples.adicionarElemento("Banana");
        listaSimples.adicionarElemento("Carne");
        listaSimples.adicionarElemento("Arroz");
        listaSimples.adicionarElemento("Macarrao");
        listaSimples.adicionarElemento("Mandioca");
        listaSimples.adicionarElemento("Tomate");
        listaSimples.adicionarElemento("Pao");
        listaSimples.adicionarElemento("Urubu");
        listaSimples.adicionarElemento("Rio");
        listaSimples.adicionarElemento("Rio Bulgaria");
        listaSimples.exibirElementos();

        listaSimples.removerPorIndice(4);
        System.out.println("----------------------");
        listaSimples.exibirElementos();

    }
}
