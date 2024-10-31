
package TowerDefense;

public class Cola {
   private Nodo frente;
    private Nodo atras;

    private static class Nodo {
        Tropa dato;
        Nodo siguiente;

        Nodo(Tropa dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    public void encolar(Tropa dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (atras != null) {
            atras.siguiente = nuevoNodo;
        }
        atras = nuevoNodo;
        if (frente == null) {
            frente = nuevoNodo;
        }
    }

    public Tropa desencolar() {
        if (estaVacia()) throw new RuntimeException("Cola vacía");
        Tropa dato = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            atras = null;
        }
        return dato;
    }

    public boolean estaVacia() {
        return frente == null;
    } 
}
