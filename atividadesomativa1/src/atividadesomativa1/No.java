package atividadesomativa1;

public class No {
    private int value;
    private No next;
    private No previous;

    No(int number) {
        value = number;
        next = null;
        previous = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }

    public No getPrevious() {
        return previous;
    }

    public void setPrevious(No previous) {
        this.previous = previous;
    }
}