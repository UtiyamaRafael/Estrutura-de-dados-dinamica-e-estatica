public class Main  {
    public static void main(String[] args) {


        PilhaDinamica ps = new PilhaDinamica();

        ps.empilhar(1);
        ps.empilhar(2);
        ps.empilhar(3);

        System.out.println("------------------");
        ps.exibir();
        ps.desempilhar();
        ps.exibir();
    }
}