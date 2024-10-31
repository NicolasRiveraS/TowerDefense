package TowerDefense;

public class Pila {
    private Nodo cima;

    private static class Nodo {
        Tropa dato;
        Nodo siguiente;

        Nodo(Tropa dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    public void apilar(Tropa dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }

    public Tropa desapilar() {
        if (estaVacia()) throw new RuntimeException("Pila vacía");
        Tropa dato = cima.dato;
        cima = cima.siguiente;
        return dato;
    }

    public boolean estaVacia() {
        return cima == null;
    }
}
