package estruturadedados;

public class Estruturadedados {

    public static void main(String[] args) {

        ArvoreBinaria a = new ArvoreBinaria();
        a.insere(20);
        a.insere(25);
        a.insere(10);
        a.insere(15);
        a.insere(30);
        a.insere(23);
        a.insere(24);
        a.insere(35);
        
        a.posOrdem();
    }
}
