package atividadesomativa1;

public class MyList {

    No first; // representa o primeiro nó da lista
    No last; // representa o último nó da lista
    int length; // representa o tamanho atual da lista

    /**
     * Construtor
     *
     */
    MyList() {
        // inicializa os atributos;
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    /**
     * @return boolean - indica se a lista está vazia ou não
     *
     */
    boolean vazia() {
        return this.first == null;
    }

    /**
     * @param int value - insere um nó no inicio da lista
     *
     */
    void inserePrimeiro(int value) {
        // caso esteja vazia, o primeiro e o ultimo nó sao o mesmo.
        if (this.vazia()) {
            this.first = new No(value);
            this.last = this.first;
        } else {
            // caso a lista nao esteja vazia
            No aux = new No(value);
            aux.setNext(this.first);
            aux.getNext().setPrevious(aux);
            this.first = aux;
        }
        this.length++;
    }

    void insereDepois(int no, int info) {
        if (length == 0) {
            inserePrimeiro(info);
        } else if(no == length) {
            insereUltimo(info);
        } else {
            No noNaPosicao = getByIndex(no);
            noNaPosicao.setValue(info);
        }
        this.length++;
    }

    void insereUltimo(int info) {
        if (this.vazia()) {
            this.inserePrimeiro(info);
        } else {
            No aux = new No(info);
            aux.setNext(null);
            aux.setPrevious(this.last);
            this.last.setNext(aux);
            this.last = aux;
        }
        this.length++;
    }

    No removePrimeiro() {
        if (!this.vazia()) {
            No aux = this.first;
            this.first = this.first.getNext();
            this.length--;
            return aux;
        }

        return null;
    }

    No removeUltimo() {
        if (!this.vazia()) {
            No aux = this.last;
            this.last = this.last.getPrevious();
            this.last.setNext(null);
            this.length--;
            return aux;
        } else {
            return null;
        }
    }

    No remove(No no) {
        if (!this.vazia()) {
            no.getNext().setPrevious(no.getPrevious());
            no.getPrevious().setNext(no.getNext());
            this.length--;
            return no;
        } else {
            return null;
        }
    }
    
    private boolean existeElementoNaPosicao(int no){
        return no >= 0 && no < length;
    }

    public No buscarNoNaPosicao(int no) {
        if(!existeElementoNaPosicao(no)) {
            throw new RuntimeException("Posição não existente");
        }

        No atual = first;

        for (int i = 0; i < no; i++) {
            atual = atual.getNext();
        }
        return atual;
    }

    void mostrar() {
        No aux = this.first;
        System.out.println("----------------");
        System.out.println("Sua lista esta preenchida com os seguintes valores:");
        while (aux != null) {
            System.out.print(aux.getValue() + " - ");
            aux = aux.getNext();
        }
        System.out.println();
        System.out.println("O tamanho da sua lista eh igual a " + length + " nos");
        System.out.println("*******************");
        System.out.println();
    }

}
