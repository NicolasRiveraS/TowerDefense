package TowerDefense;

public class ListaCDTropas {
    private Nodo cabeza;
    private Nodo cola;

    public ListaCDTropas() {
        this.cabeza = null;
        this.cola = null;
    }

    // Método para verificar si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Método para encolar una tropa
    public void encolar(Tropa tropa) {
        Nodo nuevoNodo = new Nodo(tropa);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            cola.setNext(cabeza); // Mantener la circularidad
        } else {
            cola.setNext(nuevoNodo);
            cola = nuevoNodo;
            cola.setNext(cabeza);
        }
    }

    // Método para desencolar una tropa
    public Tropa desencolar() {
        if (estaVacia()) {
            return null; // Si está vacía, no hay nada que devolver
        }

        Nodo temp = cabeza;
        Tropa tropa = temp.getTropa();

        if (cabeza == cola) { // Solo hay un elemento
            cabeza = null;
            cola = null;
        } else {
            cabeza = cabeza.getNext();
            cola.setNext(cabeza);
        }

        return tropa;
    }

    void inserta(Arquero arquero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
