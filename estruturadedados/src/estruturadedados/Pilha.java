package estruturadedados;

import java.util.Arrays;

public class Pilha {

    public int[] pilha;
    public int posicaoPilha;

    public Pilha() {
        this.posicaoPilha = -1;
        this.pilha = new int[10];
    }

    public boolean pilhaVazia() {
        return this.posicaoPilha == -1;
    }

    public int desempilhar() {
        if (pilhaVazia()) {
            return -1;
        }
        return this.pilha[this.posicaoPilha--];
    }

    public void empilhar(int valor) {
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
            System.out.println(Arrays.toString(pilha));
        }
    }

}
