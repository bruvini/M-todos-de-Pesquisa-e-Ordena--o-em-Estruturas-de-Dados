package estruturadedados;
public class Estruturadedados {

    public static void main(String[] args) {
        
        Pilha p = new Pilha();
        
        p.empilhar(10);
        p.empilhar(42);
        p.empilhar(90);
        p.desempilhar();
        p.empilhar(137);
        p.pilhaVazia();
        p.empilhar(666);
    }
    
}
