package estruturadedados;

public class ArvoreBinaria {

    private No raiz;

    public void insere(Integer valor) {
        insere(raiz, valor);
    }

    public void insere(No no, Integer valor) {
        if (no == null) {
            raiz = new No(valor);
        } else if (valor >= no.info()) {
            if (no.direita() == null) {
                no.setDireita(new No(valor));
            } else {
                insere(no.direita(), valor);
            }
        } else if (no.esquerda() == null) {
            no.setEsquerda(new No(valor));
        } else {
            insere(no.esquerda(), valor);
        }
    }

    public void preOrdem() {
        preOrdem(raiz);
    }

    public void preOrdem(No no) {
        if (no != null) {
            System.out.print(no.info() + " -> ");
            preOrdem(no.esquerda());
            preOrdem(no.direita());
        }
    }

    public void inOrdem() {
        inOrdem(raiz);
    }

    public void inOrdem(No no) {
        if (no != null) {
            inOrdem(no.esquerda());
            System.out.print(no.info() + " -> ");
            inOrdem(no.direita());
        }
    }

    public void posOrdem() {
        posOrdem(raiz);
    }

    public void posOrdem(No no) {
        if (no != null) {
            posOrdem(no.esquerda());
            posOrdem(no.direita());
            System.out.print(no.info() + " -> ");
        }
    }

    public No remove(Arvore arvore, Integer valor) {
        remover(arvore, raiz, valor, null);
    }

    public No remover(Arvore arvore, No no, Integer valor, No pai) {

        if (no != null) {
            if (no.info() == valor) {
                if (no.esquerda() == null && no.direita() == null) {
                    if (pai == null) {
                        arvore.raiz == null;
                    } else if (no.info() >= pai.info()) {
                        pai.setDireita(null);
                    } else {
                        pai.setEsquerda(null);
                    }
                } else if (no.esquerda() == null) {
                    if (no.info() >= pai.info()) {
                        pai.setDireita(no.direita());
                    } else {
                        pai.setEsquerda(no.direita());
                    }
                    no.setEsquerda(null);

                } else if (no.direita() == null) {
                    if (no.info() >= pai.info()) {
                        pai.setDireita(no.esquerda());
                    } else {
                        pai.setEsquerda(no.esquerda());
                    }
                    no.setEsquerda(null);
                } else {
                    
                }
            }
        }

        return null;
    }
}
