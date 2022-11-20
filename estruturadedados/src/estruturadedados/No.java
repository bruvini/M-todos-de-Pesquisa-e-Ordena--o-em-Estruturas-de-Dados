package estruturadedados;
public class No {
    public Integer info;
    public No direita;
    public No esquerda;
    
    public No(int info){
        this.info = info;
    }

    public Integer info() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }

    public No direita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    public No esquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }
}
