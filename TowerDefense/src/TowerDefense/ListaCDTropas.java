package TowerDefense;

public class ListaCDTropas {
    // Atributos
    private Nodo cabeza;
    private Nodo ultimo;
    
    // Constructor
    public ListaCDTropas () {}
    
    // Métodos
    public void inserta (Tropa t) {
        if (cabeza == null) {
            cabeza = new Nodo(t);
            ultimo = cabeza;
            cabeza.setNext(ultimo);
            cabeza.setBack(ultimo);
            ultimo.setNext(cabeza);
            ultimo.setBack(cabeza);
        }
        else if (cabeza == ultimo) {
            Nodo aux = new Nodo(t);
            cabeza.setNext(aux);
            aux.setBack(cabeza);
            ultimo = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }
        else {
            Nodo aux = new Nodo(t);
            ultimo.setNext(aux);
            aux.setBack(ultimo);
            ultimo = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }
    }

    @Override
    public String toString() {
        Nodo aux = cabeza;
        String s = "Tropas:\n";
        
        if (aux != null) {
            do {
                s += aux.getTropa() + "\n";
                aux = aux.getNext();
            } 
            while (aux != cabeza);
        }
        else {
            s += "No hay tropas registradas";
        }
        
        return s;
    }
    
    
}
