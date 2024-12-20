package TowerDefense;

public class ListaDCRivales {
    // Atributos
    private Nodo cabeza;
    private Nodo ultimo;
    
    // Constructor
    public ListaDCRivales () {}
    
    // Métodos
    public void inserta (Rival rival) {
        if (cabeza == null) {
            cabeza = new Nodo(rival);
            ultimo = cabeza;
            cabeza.setNext(ultimo);
            cabeza.setBack(ultimo);
            ultimo.setNext(cabeza);
            ultimo.setBack(cabeza);
        }
        else {
            Nodo aux = new Nodo(rival);
            ultimo.setNext(aux);
            aux.setBack(ultimo);
            ultimo = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }
    }
    
    public Rival getRival (int posicion) {
        Nodo aux = cabeza;
        if (posicion > 0) {
            for (int i = 0; i < posicion; i++) {
            aux = aux.getNext();
            }
        }
        return aux.getRival();
    }

    @Override
    public String toString() {
        String s = "";
        Nodo aux = cabeza;
        do {
            s += aux.getRival().getNombre() + ", ";
            aux = aux.getNext();
        } while (aux != cabeza);
        return s;
    }
}