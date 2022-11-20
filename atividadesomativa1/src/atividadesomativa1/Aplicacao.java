package atividadesomativa1;

public class Aplicacao {
    
    public static void main(String[] args) {
        MyList lista = new MyList();
        lista.inserePrimeiro(1);
        lista.insereUltimo(40);
        lista.inserePrimeiro(3);
        lista.inserePrimeiro(144);
        lista.insereUltimo(347);
        
        lista.mostrar();
        
        lista.removeUltimo();
        lista.removePrimeiro();
        
        lista.mostrar();
        
        lista.insereDepois(40, 4);
        lista.mostrar();
    }
}
